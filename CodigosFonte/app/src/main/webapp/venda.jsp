<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="WEB-INF/partilals/htmlHead.jsp"></jsp:include>
            <title>Venda</title>
        </head>
        <body>
        <jsp:include page="WEB-INF/partilals/menu.jsp"></jsp:include>
        <div class="container form-cadastro">
            <div class="titulo">
                <h2>Venda</h2>   
            </div>
            <form method="POST">
                <div class="form-dados">
                    <div class="form-flex">
                        <div class="form-group form-cliente">
                            <label>Nome</label>
                            <input type="text" name="cliente" required class="form-control" />
                        </div>

                        <div class="form-group form-cpf">
                            <label>CPF</label>
                            <input type="text" name="cpf" required class="form-control" />
                        </div>
                    </div>

                    <div class="form-flex">
                        <div  class="form-group form-codigo">
                            <label>Cód.Produto</label>
                            <input type="text" name="codigo" required class="form-control" placeholder="Pesquise pelo codigo">
                        </div>

                        <div  class="form-group form-produto">
                            <label>Nome do Produto</label>
                            <input pattern="[a-zA-Z]+" type="text" required name="produto" class="form-control" placeholder="Pesquise pelo nome" >
                        </div>
                    </div>
                    <div class="form-flex">
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

            </form>
        </div>
    </body>
</html>
