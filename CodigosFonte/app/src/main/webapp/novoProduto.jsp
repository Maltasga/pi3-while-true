<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Coleção</title>
        <jsp:include page="WEB-INF/partilals/htmlHead.jsp"></jsp:include>
        </head>
        <body>
        <jsp:include page="WEB-INF/partilals/menu.jsp"></jsp:include>
            <div class="container form-cadastro">
                <div class="titulo">
                    <h2>Cadastro de Produto</h2>   
                </div>
                <form>
                    <div class="form-dados">
                        <div  class="form-group form-codigo">
                            <label>Cód.Produto</label>
                            <input type="text" required name="codigo" class="form-control">
                        </div>

                        <div  class="form-group form-produto">
                            <label>Nome do Produto</label>
                            <input pattern="[a-zA-Z]+" type="text" required name="produto" class="form-control" placeholder="Insira o nome do Produto aqui" >
                        </div>

                        <div class="form-group form-descricao">
                            <label>Descrição</label>
                            <input type="text" required name="descricao" class="form-control">
                        </div>

                        <div class="form-group form-colecao">
                            <label>Coleção</label>
                            <select name="colecao" class="form-control" required >
                                <option value="">   </option>
                                <option value="">Outono</option>
                                <option value="">Primavera</option>
                                <option value="">Verão</option>
                                <option value="">Inverno</option>                        
                            </select>
                        </div>

                        <div class="form-group form-tipo">
                            <label>Tipo</label>
                            <select name="tipo" class="form-control" required >
                                <option value="">   </option>
                                <option value="">Outono</option>
                                <option value="">Primavera</option>
                                <option value="">Verão</option>
                                <option value="">Inverno</option>                        
                            </select>
                        </div>

                        <div class="form-group form-cor">
                            <label>Cor</label>
                            <select name="cor" class="form-control" required >
                                <option value="">   </option>
                                <option value="">Preto</option>
                                <option value="">Azul</option>
                                <option value="">Rosa</option>
                                <option value="">Violeta</option>                        
                            </select>
                        </div>

                        <div  class="form-group form-valor">
                            <label>Valor de Produção</label>
                            <input type="text" required name="valProducao" class="form-control">
                        </div>

                        <div  class="form-group form-valor">
                            <label>Valor de Venda</label>
                            <input type="text" required name="valVenda" class="form-control">
                        </div>


                        <div class="form-group">
                            <label>Tamanho</label>
                            <select name="cor" class="form-control" required >
                                <option value="">   </option>
                                <option value="">P</option>
                                <option value="">M</option>
                                <option value="">G</option>
                                <option value="">GG</option>                        
                            </select>
                        </div>

                        <div  class="form-group">
                            <label>Quantidade</label>
                            <input type="text" required name="quantidade" class="form-control">
                        </div>

                        <table class="table table-hover">
                            <thead>
                                <tr>
                                    <th>Tamanho</th>
                                    <th>Quantidade</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td>teste</td>
                                    <td>teste</td>
                                </tr>
                            </tbody>
                        </table>

                        <div id="actions" class="row form-group">
                            <div class="form-botoes">
                                <button type="submit" class="btn btn-primary">Salvar</button>
                                <a href="index.html" class="btn btn-warning">Cancelar</a>
                            </div>
                        </div>
                    </div>
                </form>
            </div>
            <footer>
            <jsp:include page="/WEB-INF/partilals/rodape.jsp"></jsp:include>
        </footer>
    </body>
</html>
