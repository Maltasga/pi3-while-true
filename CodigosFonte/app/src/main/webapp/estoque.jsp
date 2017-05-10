<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="WEB-INF/partilals/htmlHead.jsp"></jsp:include>
            <link href="Content/css/estoque.css" rel="stylesheet" type="text/css"/>
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
                        <div class="form-group form-produto">
                            <label>Produto</label>
                            <br>    
                            <label>nome do produto aqui</label>
                        </div>
                    </div>
                    <div class="form-flex">
                        <div class="form-group form-filial">
                            <label>Filial</label>
                            <select name="filial" required class="form-control" >
                                <option value="">   </option>
                                <option value="">Matriz</option>
                                <option value="">Florianopolis</option>
                                <option value="">São Paulo</option>                     
                            </select>     
                        </div>
                        <div class="form-group form-quantidade">
                            <label>Quantidade</label>
                            <input type="text" name="quantidade" required class="form-control" />
                        </div>
                        <div class="form-group form-tamanho">
                            <label>Tamanho</label>
                            <select name="tamanho" required class="form-control" >
                                <option value=""> </option>
                                <option value="">P</option>
                                <option value="">M</option>
                                <option value="">G</option>    
                                <option value="">GG</option> 
                                <option value="">EGG</option> 
                            </select>     
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
