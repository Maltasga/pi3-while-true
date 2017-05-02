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
