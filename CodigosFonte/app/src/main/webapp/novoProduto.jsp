<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Produto</title>
        <jsp:include page="WEB-INF/partilals/htmlHead.jsp"></jsp:include>
        <link href="Content/css/produto.css" rel="stylesheet" type="text/css"/>
        </head>
        <body>
        <jsp:include page="WEB-INF/partilals/menu.jsp"></jsp:include>
            <div class="container form-cadastro">
                <div class="titulo">
                    <h2>Cadastro de Produto</h2>   
                </div>
                <form method="POST">
                    <div class="form-dados">
                        <div class="form-flex">
                            <div  class="form-group form-codigo">
                                <label>Cód.Produto</label>
                                <input type="text" required name="codigo" required class="form-control">
                            </div>

                            <div  class="form-group form-produto">
                                <label>Nome do Produto</label>
                                <input pattern="[a-zA-Z]+" type="text" required name="produto" class="form-control" placeholder="Insira o nome do Produto aqui" >
                            </div>

                            <div class="form-group form-descricao">
                                <label>Descrição</label>
                                <input type="text"  name="descricao" class="form-control">
                            </div>
                        </div>
                        <div class="form-combos">
                            <div class="form-group form-colecao">
                                <label>Coleção</label>
                                <select name="colecao" required class="form-control" >
                                    <option value="">   </option>
                                    <option value="">Outono</option>
                                    <option value="">Primavera</option>
                                    <option value="">Verão</option>
                                    <option value="">Inverno</option>                        
                                </select>
                            </div>

                            <div class="form-group form-tipo">
                                <label>Tipo</label>
                                <select name="tipo" required class="form-control" >
                                    <option value="">   </option>
                                    <option value="">Outono</option>
                                    <option value="">Primavera</option>
                                    <option value="">Verão</option>
                                    <option value="">Inverno</option>                        
                                </select>
                            </div>

                            <div class="form-group form-cor">
                                <label>Cor</label>
                                <select name="cor" required class="form-control" required >
                                    <option value="">   </option>
                                    <option value="">Preto</option>
                                    <option value="">Azul</option>
                                    <option value="">Rosa</option>
                                    <option value="">Violeta</option>                        
                                </select>
                            </div>
                        </div>

                        <div class="form-valor">
                            <div  class="form-group form-valor-item">
                                <label>Valor de Produção</label>
                                <input type="text" pattern="[0-9]+" name="valProducao" required class="form-control">
                            </div>

                            <div  class="form-group form-valor-item">
                                <label>Valor de Venda</label>
                                <input type="text" pattern="[0-9]+" name="valVenda" required class="form-control">
                            </div>
                        </div>
                    </div>
                    <div id="actions" class="form-group">
                        <div class="form-botoes">
                            <button type="submit" class="btn btn-primary">Salvar</button>
                            <a href="index.html" class="btn btn-warning">Cancelar</a>
                        </div>
                    </div>
                </form>
            </div>
<!--            <footer>
        <jsp:include page="/WEB-INF/partilals/rodape.jsp"></jsp:include>
        </footer>-->
    </body>
</html>
