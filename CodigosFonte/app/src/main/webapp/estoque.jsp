<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="WEB-INF/partilals/htmlHead.jsp"></jsp:include>
            <title>Estoque</title>
        </head>
        <body>
        <jsp:include page="WEB-INF/partilals/menu.jsp"></jsp:include>
        <div class="container form-cadastro">
            <div class="titulo">
                <h2>Estoque</h2>   
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
                </div>
                <div id="actions" class="form-group">
                    <div class="form-botoes">
                        <button type="submit" class="btn btn-primary">Salvar</button>
                        <a href="index.html" class="btn btn-warning">Cancelar</a>
                    </div>
                </div>
            </form>
        </div>
    </body>
</html>
