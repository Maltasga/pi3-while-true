<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt">
    <head>
        <jsp:include page="../../WEB-INF/partilals/htmlHead.jsp"></jsp:include>
            <title>Relatórios</title>
        </head>
        <body>
        <jsp:include page="../../WEB-INF/partilals/menu.jsp"></jsp:include>
            <h2>Relatório de Vendas</h2>
            <p>Período: <c:out value="${periodo}"></c:out></p>
        <p>Filial: <c:out value="${nomeFilial}"></c:out></p>
            <!--        <p>Total de Vendas no período: </p>-->
            <table class="table table-hover">
                <thead>
                    <tr>
                        <th>Filial</th>
                        <th>Data da venda</th>
                        <th>Vendedor</th>
                        <th>Valor total</th>
                    </tr>
                </thead>
                <tbody>
                <c:forEach items="${listaVendas}" var="v">
                    <tr>
                        <td><c:out value="${v.nome}"></c:out></td>
                        <td><fmt:formatDate value="${u.dataCadastro}" pattern="dd/MM/yyyy"></fmt:formatDate></td>
                        <td><c:out value="${v.vendedor}"></c:out></td>
                        <td><c:out value="${v.valorTotal}"></c:out></td>
                        </tr>
                </c:forEach>
            </tbody>
        </table>
        <button>Voltar</button>
    </body>
</html>
