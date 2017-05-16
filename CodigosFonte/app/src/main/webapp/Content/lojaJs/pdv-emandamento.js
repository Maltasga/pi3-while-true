window.addEventListener("load", function () {
    var produtos = [], total = 0, carrinho = [];

    var campos = {
        hdnClienteId: $("#hdnClienteId"),
        txtIdentificadorProduto: $("#txtIdentProduto"),
        totalCompra: $("#totalCompra")
    };

    function limparCampos() {
        document.querySelector("#btnAddItem").setAttribute("ixproduto", null);
        document.querySelector("#txtIdentProduto").value = "";
        document.querySelector("#lblDescricao").textContent = "";
        document.querySelector("#lblValor").textContent = "";
        document.querySelector("#lblCor").textContent = "";
        document.querySelector("#txtQtde").value = "";
        document.querySelector("#ddlTamanho").options[0].selected = true;
    }

    function formataValorMoeda(v) {
        return accounting.formatMoney(v, "R$", 2, ".", ",");
    }

    function calculaValorTotal() {
        if (carrinho.length) {
            total = carrinho.reduce(function (soma, item) {
                return soma + (item.quantidade * item.valorUnitario);
            }, 0);
        } else {
            total = 0;
        }
    }

    function escreveValorTotal() {
        campos.totalCompra.html("Total " + formataValorMoeda(total));
    }

    function carregaAutoComplete() {
        campos.txtIdentificadorProduto.easyAutocomplete({
            data: produtos,
            getValue: "nome",
            template: {
                type: "description",
                fields: {description: "cor"}
            },
            list: {
                maxNumberOfElements: 10,
                match: {enabled: true},
                onChooseEvent: function () {
                    var produto = campos.txtIdentificadorProduto.getSelectedItemData();
                    if (produto) {
                        document.querySelector("#btnAddItem").setAttribute("ixproduto", produto.id);
                        document.querySelector("#lblDescricao").textContent = produto.descricao;
                        document.querySelector("#lblValor").textContent = formataValorMoeda(produto.valorVenda);
                        document.querySelector("#lblCor").textContent = produto.cor;
                    }
                }
            }
        });
    }

    function adicionaItemGrid(produto) {
        if (produto) {
            var tbody = document.querySelector("#listaItens tbody");
            var tr = document.createElement("tr");
            var tdNome = _montaTd(produto.nome);
            var ddlTamanho = document.querySelector("#ddlTamanho");
            var tdTam = _montaTd(ddlTamanho.options[ddlTamanho.selectedIndex].value);
            var tdValorUni = _montaTd(formataValorMoeda(produto.valorVenda));
            var tdQtde = _montaTd(document.querySelector("#txtQtde").value);
            var valorTotal = produto.valorVenda * parseInt(document.querySelector("#txtQtde").value);
            var tdValotTotal = _montaTd(formataValorMoeda(valorTotal));
            var btnExcluir = document.createElement("span");
            btnExcluir.classList.add("glyphicon", "glyphicon-remove");
            btnExcluir.style.cursor = "pointer";
            btnExcluir.setAttribute("ixproduto", 0);
            btnExcluir.addEventListener("click", function () {
                if (confirm("Deseja remover este item?")) {
                    carrinho.splice(this.getAttribute("ixproduto"), 1);
                    calculaValorTotal();
                    escreveValorTotal();
                    this.parentNode.parentNode.remove();
                }
            });
            var tdBotao = document.createElement("td");
            tdBotao.appendChild(btnExcluir);
            tr.appendChild(tdNome);
            tr.appendChild(tdTam);
            tr.appendChild(tdValorUni);
            tr.appendChild(tdQtde);
            tr.appendChild(tdValotTotal);
            tr.appendChild(tdBotao);
            tbody.appendChild(tr);
        }

        function _montaTd(texto) {
            var td = document.createElement("td");
            var text = document.createTextNode(texto);
            td.appendChild(text);
            return td;
        }
    }

    escreveValorTotal();
    xhrRequest("getProdutos", "post", "application/x-www-form-urlencoded", null, function (response) {
        produtos = (JSON.parse(response));
        carregaAutoComplete();
    });

    document.querySelector("#btnAddItem")
            .addEventListener("click", function () {
                var id = parseInt(this.getAttribute("ixproduto"));
                var produto = produtos.filter(function (item) {
                    return item.id === id;
                });
                if (produto.length) {
                    produto = produto[0];
                    var ddlTamanho = document.querySelector("#ddlTamanho");
                    var itemCarrinho = {
                        idVenda: 0,
                        idProduto: produto.id,
                        tamanho: ddlTamanho.options[ddlTamanho.selectedIndex].value,
                        quantidade: parseInt(document.querySelector("#txtQtde").value),
                        valorUnitario: produto.valorVenda
                    };
                    carrinho.push(itemCarrinho);
                    adicionaItemGrid(produto);
                    calculaValorTotal();
                    escreveValorTotal();
                    limparCampos();
                }
            });

    document.querySelector("#btnCancelarVenda")
            .addEventListener("click", function () {
                if (confirm("Ao cancelar estar venda todos os dados serão perdidos. Confirma?"))
                    window.location = "venda";
            });

    document.querySelector("#btnFinalizarVenda")
            .addEventListener("click", function () {
                if (carrinho.length) {
                    var form = document.createElement("form");
                    form.method = "post";
                    form.action = "finalizar-venda";
                    form.appendChild(_criarHidden("idCliente", campos.hdnClienteId.val()));
                    form.appendChild(_criarHidden("valorTotal", total));
                    for (var i = 0; i < carrinho.length; i++) {
                        var c = carrinho[i];
                        form.appendChild(_criarHidden("itens[" + i + "].idVenda", 0));
                        form.appendChild(_criarHidden("itens[" + i + "].idProduto", c.idProduto));
                        form.appendChild(_criarHidden("itens[" + i + "].tamanho", c.tamanho));
                        form.appendChild(_criarHidden("itens[" + i + "].quantidade", c.quantidade));
                    }
                    document.querySelector("#formulario").appendChild(form);
                    form.submit();
                } else {
                    alert("Lista de compras está vazia!");
                }

                function _criarHidden(name, valor) {
                    var h = document.createElement("input");
                    h.type = "hidden";
                    h.name = name;
                    h.value = valor;
                    return h;
                }
            });
});