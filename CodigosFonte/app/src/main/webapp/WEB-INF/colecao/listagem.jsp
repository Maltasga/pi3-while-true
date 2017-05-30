<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt">
    <head>
        <jsp:include page="../../WEB-INF/partilals/htmlHead.jsp"></jsp:include>
            <title>Lista de Coleções</title>
        </head>
        <body>
        <jsp:include page="../../WEB-INF/partilals/menu.jsp"></jsp:include>
            <div class="container form-cadastro">
                <div class="titulo">
                    <h2>
                        Coleções cadastrados
                    </h2>
                </div>

                <table class="table table-hover">
                    <thead>
                        <tr>
                            <th>Nome</th>
                            <th>Periodo</th>
                            <th>Ano</th>
                            <th></th>
                        </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${listaColecoes}" var="c">
                        <tr>
                            <td><c:out value="${c.nome}"></c:out></td>
                            <td><c:out value="${c.cpf}"></c:out></td>
                            <td><c:out value="${c.sexo}"></c:out></td>
                                <td>
                                <fmt:formatDate value="${c.dataNascimento}" pattern="dd/MM/yyyy"></fmt:formatDate>
                                </td>
                                <td>
                                <fmt:formatDate value="${c.dataCadastro}" pattern="dd/MM/yyyy"></fmt:formatDate>
                                </td>
                                <td>
                                    <span class="btn-editar glyphicon glyphicon-pencil" data-id="<c:out value="${c.id}"></c:out>" title="editar"></span>
                                    &nbsp;
                                    <span class="btn-excluir glyphicon glyphicon-remove" data-id="<c:out value="${c.id}"></c:out>" title="excluir"></span>
                                </td>
                            </tr>
                    </c:forEach>
                </tbody>
            </table>
            <div class="text-right">
                <input type="button" id="btnNovaColecao" value="Nova Coleção" class="btn btn-primary" />
            </div>
        </div>  
        <jsp:include page="../../WEB-INF/partilals/scripts.jsp"></jsp:include>
         <jsp:include page="../../WEB-INF/partilals/scripts.jsp"></jsp:include>
        <script src="Content/lojaJs/listagem-cliente.js" type="text/javascript"></script>
    </body>
</html>