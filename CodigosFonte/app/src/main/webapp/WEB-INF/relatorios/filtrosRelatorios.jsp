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
            <form method="GET" action="relatorios">
            <c:choose>
                <c:when test="${filialAtiva != 1}">
                    <select name="filial" disabled>
                        <option value="${filialAtiva.id}" selected="selected" >${filialAtiva.nome}</option>  
                    </select>
                </c:when>
                <c:otherwise>
                    <select name="filial">
                        <option value=""></option>
                        <option value="todas">Todas as Filiais</option>
                        <c:forEach items="$listaFiliais" var="f">
                            <option value="${f.id}">${f.nome}</option>
                        </c:forEach>
                    </select>
                </c:otherwise>
            </c:choose>
            <label>Período</label>
            <select name="periodo">
                <option value=""></option>
                <c:forEach items="${periodo}" var="p">
                    <option value="${periodo}">${periodo}</option>
                </c:forEach>
            </select>
            <button type="submit">Gerar</button>
        </form>
    </body>
</html>
