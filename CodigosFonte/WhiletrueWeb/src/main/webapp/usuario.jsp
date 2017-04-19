<%-- 
    Document   : usuario
    Created on : 18/04/2017, 19:44:39
    Author     : gabri
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Usuários</title>
    </head>
    <body>
        <h1>Cadastro de Usuário</h1>
        <form action="gravar">
            <input type="hidden" value="" name="idUser" />
            <div>
                <label>Nome</label>
                <input type="text" name="nome" value="" />
            </div>
            <div>
                <label>Perfil</label>
                <select>
                    
                </select>
            </div>
        </form>
    </body>
</html>
