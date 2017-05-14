window.addEventListener("load", function () {
    var produtos = [];
    var campos = {
        txtIdentificadorProduto: $("#txtIdentProduto")
    };

    (function () {
        var xhr = new XMLHttpRequest();
        xhr.open("post", "getProdutos", true);
        xhr.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
        xhr.onreadystatechange = function () {
            if (xhr.readyState === XMLHttpRequest.DONE && xhr.status === 200) {
                produtos = (JSON.parse(xhr.responseText));

                campos.txtIdentificadorProduto.easyAutocomplete({
                    data: produtos.map(function (item) {
                        return {"id": item.id, "nome": item.nome};
                    }),
                    getValue: "nome",
                    list: {
                        maxNumberOfElements: 10,
                        match: {enabled: true},
                        onChooseEvent: function () {
                            var ixProduto = campos.txtIdentificadorProduto.getSelectedItemIndex();
                            var produto = produtos[ixProduto];
                            if (produto) {
                                document.querySelector("#btnAddItem").setAttribute("ixproduto", ixProduto)
                                document.querySelector("#lblDescricao").textContent = produto.descricao;
                                document.querySelector("#lblValor").textContent =
                                        "R$ " + produto.valorVenda.toString().replace(".", ",");
                                document.querySelector("#lblCor").textContent = produto.cor;
                            }
                        }
                    }
                });
            }
        }
        xhr.send();
    })();
    $("#btnAddItem").on("click", function () {
        var produto = produtos[this.getAttribute("ixproduto")];
        if (produto) {
            var tbody = document.querySelector("#listaItens tbody");
            var tr = document.createElement("tr");
            var tdNome = _montaTd(produto.nome);
            var ddlTamanho = document.querySelector("#ddlTamanho");            
            var tdTam = _montaTd(ddlTamanho.options[ddlTamanho.selectedIndex].value);
            var tdValorUni = _montaTd(produto.valorVenda);
            var tdQtde = _montaTd(document.querySelector("#txtQtde").value);
            var valorTotal = produto.valorVenda * parseInt(document.querySelector("#txtQtde").value);
            var tdValotTotal = _montaTd(valorTotal);
            tr.appendChild(tdNome);
            tr.appendChild(tdTam);
            tr.appendChild(tdValorUni);
            tr.appendChild(tdQtde);
            tr.appendChild(tdValotTotal);
            tbody.appendChild(tr);
        }

        function _montaTd(texto) {
            var td = document.createElement("td");
            var text = document.createTextNode(texto);
            td.appendChild(text);
            return td;
        }
    });
});