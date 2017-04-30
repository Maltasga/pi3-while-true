<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%-- 
    Document   : listagem
    Created on : 30/04/2017, 00:05:35
    Author     : Karol
--%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Cadastro de Filial</title>
        <link href="Content/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="container">
            <div class="panel panel-title">
                <h2>
                    Lista de Filiais
                </h2>
            </div>
            <table class="table table-hover">
                <thead>
                    <tr>
                        <th>Razão Social</th>
                        <th>CNPJ</th>
                        <th>UF</th>
                        <th>Cidade</th>
                        <th>Status</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${listaFiliais}" var="f">
                        <tr>
                            <td><c:out value="${f.razaosocial}"></c:out></td>
                            <td><c:out value="${f.cnpj}"></c:out></td>
                            <td><c:out value="${f.uf}"></c:out></td>
                            <td><c:out value="${f.cidade}"></c:out></td>
                            <td><c:out value="${f.status}"></c:out></td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>    
        <script src="Content/jquery.min.js" type="text/javascript"></script>
        <script src="Content/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
    </body>
</html>
