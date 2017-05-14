<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt">
    <head>
        <jsp:include page="../../WEB-INF/partilals/htmlHead.jsp"></jsp:include>
            <title>Cadastro de Filial</title>
        </head>
        <body>
        <jsp:include page="../../WEB-INF/partilals/menu.jsp"></jsp:include>
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
        <jsp:include page="../../WEB-INF/partilals/scripts.jsp"></jsp:include>
    </body>
</html>
