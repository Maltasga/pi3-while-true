<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="../partilals/htmlHead.jsp"></jsp:include>
            <title>Cliente</title>
        </head>
        <body>
        <jsp:include page="../partilals/menu.jsp"></jsp:include>
        <div class="container form-cadastro">
            <div class="titulo">
                <h2>Cliente</h2>   
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
                        <div class="form-group form-sexo">
                            <label>Sexo</label>
                            <select name="sexo" required class="form-control" >
                                <option value=""> </option>
                                <option value="F">Feminino</option>
                                <option value="M">Masculino</option>
                            </select>     
                        </div>
                        <div class="form-group form-nascimento">
                            <label>Data de Nascimento</label>
                            <input type="text" name="nascimento" required class="form-control" />
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
