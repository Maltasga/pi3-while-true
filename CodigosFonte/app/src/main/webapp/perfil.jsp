<%-- 
    Document   : usuario.jsp
    Created on : 19/04/2017, 18:54:23
    Author     : While True
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Cadastro de Perfil</h1>
        <hr>
        <table>
            <tr>
                <td>
                    Nome
                </td>
                <td>
                    <input type="text" name="nome" />
                </td>
            </tr>
            <tr>
                <td>
                    Perfil
                </td>
                <td>
                    <select name="perfil">
                        
                    </select>
                </td>
            </tr>
        </table>
    <c:forEach items="${listaPerfis}" var="p">
        <p>
        <c:out value="${p.nome}"></c:out>
        </p>
    </c:forEach>
    </body>
</html>
