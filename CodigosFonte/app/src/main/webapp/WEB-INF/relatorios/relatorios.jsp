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
            <h2>Relatórios por Filial</h2>        
            <form method="POST" action="rel-vendas-geral">
            <c:choose>
                <c:when test="${filialAtiva.id != 1}">
                    <select name="filial" disabled>
                        <option value="${filialAtiva.id}" selected="selected" >${filialAtiva.nome}</option>  
                    </select>
                </c:when>
                <c:otherwise>
                    <select name="filial">
                        <option value=""></option>
                        <option value="0">Todas as Filiais</option>
                        <c:forEach items="${listaFiliais}" var="f">
                            <option value="${f.id}">${f.nome}</option>
                        </c:forEach>
                    </select>
                </c:otherwise>
            </c:choose>
                <label>Período</label>
                <select name="periodo">
                    <option value=""></option>
                <c:forEach items="${periodo}" var="p">
                    <option value="${p}">${p}</option>
                </c:forEach>
            </select>
            <button type="submit">Gerar</button>
        </form>
        <h2>Relatório de Vendas</h2>
        <p>Período: <c:out value="${periodoSelecionado}"></c:out></p>
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
                        <td><fmt:formatDate value="${v.dataVenda}" pattern="dd/MM/yyyy"></fmt:formatDate></td>
                        <td><c:out value="${v.vendedor}"></c:out></td>
                        <td><c:out value="${v.valorTotal}"></c:out></td>
                        </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
