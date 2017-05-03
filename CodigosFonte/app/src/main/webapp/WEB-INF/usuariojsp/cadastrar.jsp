<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt">
    <head>
        <title>Cadastro de Usuário</title>
        <jsp:include page="../partilals/htmlHead.jsp"></jsp:include>
        </head>
        <body>
        <jsp:include page="../partilals/menu.jsp"></jsp:include>
            <div class="container form-cadastro">
                <div class="titulo">
                    <h2>Novo usuário</h2>
                </div>
                <div style="width: 70%;">
                    <form method="post" action="novousuario" class="form-dados">
                        <div class="form-group">
                            <label>Nome</label>
                            <input type="text" class="form-control" name="nome" required="required"/>
                        </div>
                        <div class="form-group">
                            <label>Email</label>
                            <input type="email" class="form-control" name="email" required="required" />
                        </div>
                        <div class="form-group">
                            <label>Login</label>
                            <input type="text" class="form-control" name="login" required="required"/>
                        </div>
                        <div class="form-group">
                            <label>Senha</label>
                            <input type="password" class="form-control" name="senha" required="required"/>
                        </div>
                        <div class="form-group">
                            <label>Confirme sua senha</label>
                            <input type="password" class="form-control" id="txtConfirmarSenha" required="required"/>
                        </div>
                        <div class="form-group text-justify">
                            <input type="checkbox" id="chkAtivo" name="ativo" value="true" checked="checked" />
                            <label for="chkAtivo">Ativo</label>
                            &nbsp;
                            <label>Filial</label>
                            <select name="filial">
                            <c:forEach items="${listaFilial}" var="f">
                                <option value="${f.id}">${f.nome}</option>
                            </c:forEach>
                        </select>
                        &nbsp;
                        <label>Perfil</label>
                        <select name="perfil">
                            <c:forEach items="${listaPerfil}" var="p">
                                <option value="${p.id}">${p.nome}</option>
                            </c:forEach>
                        </select>
                    </div>
                    <div class="form-group text-right">
                        <input type="submit" value="Salvar" class="btn btn-primary" />
                        <input type="reset" value="Cancelar" class="btn btn-warning"/>
                    </div>
                </form>
            </div>
        </div>
    </body>
</html>