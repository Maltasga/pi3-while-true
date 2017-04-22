<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Cadastro de Usuário</title>
        <link href="Content/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="container">
            <div class="panel panel-title">
                <h2>
                    Lista de Usuário
                </h2>
            </div>
            <table class="table table-hover">
                <thead>
                    <tr>
                        <th>Nome</th>
                        <th>Perfil</th>
                        <th>Status</th>
                        <th>Data de Cadastro</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${listaUsuarios}" var="u">
                        <tr>
                            <td><c:out value="${u.nome}"></c:out></td>
                            <td><c:out value="${u.perfil.nome}"></c:out></td>
                            <td><c:out value="${u.ativo}"></c:out></td>
                            <td><c:out value="${u.dataCadastro}"></c:out></td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>    
        <script src="Content/jquery.min.js" type="text/javascript"></script>
        <script src="Content/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
    </body>
</html>