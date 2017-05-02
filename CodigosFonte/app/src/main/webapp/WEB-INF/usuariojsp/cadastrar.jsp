<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt">
    <head>
        <title>Cadastro de Usuário</title>
        <jsp:include page="../partilals/htmlHead.jsp"></jsp:include>
    </head>
    <body>
        <div class="container">
            <div class="panel panel-title">
                <h2>
                    Cadastro de Usuário
                </h2>
            </div>
            <div class="col-md-12">
                <form action="usuario" method="POST" class="form-group">
                    <input type="hidden" name="id" value="0" />
                    <div class="form-group">
                        <label>Nome</label>
                        <input type="text" name="nome" class="form-control" required="required" />
                    </div>
                    <div class="form-group">
                        <label>Perfil</label>
                        <select name="perfil" class="form-control">
                            <c:forEach items="${listaPerfis}" var="l">
                                <option value="${l.id}">${l.nome}</option>
                            </c:forEach>
                        </select>
                    </div>
                    <hr>
                    <div class="form-group">
                        <label>Login</label>
                        <input type="text" name="login" class="form-control" />
                    </div>
                    <div class="form-group">
                        <label>Senha</label>
                        <input type="password" name="senha" class="form-control" />
                    </div>
                    <div class="text-right">
                        <input type="submit" class="btn btn-primary" value="Enviar" />
                        <input type="reset" class="btn btn-warning" value="Cancelar" />
                    </div>
                </form>
            </div>
            <div class="col-md-12">
                <jsp:include page="listagem.jsp"></jsp:include>
            </div>
        </div>    
        <script src="Content/jquery.min.js" type="text/javascript"></script>
        <script src="Content/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
    </body>
</html>