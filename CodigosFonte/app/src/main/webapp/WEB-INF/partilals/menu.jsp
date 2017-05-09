<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="menu">
    <img src="/Content/img/logo.png" alt="Logo da Empresa" class="logo">
    <ul class="nav nav-pills menu-itens">
        <li role="presentation" class="active">
            <a href="home" aria-controls="home" role="tab" data-toggle="tab">Home</a>
        </li>
        <c:forEach items="${menus}" var="m">
            <li role="presentention">
                <a href="${m.caminho}" role="tab" data-toggle="tab">
                    ${m.nome}
                </a>
            </li>
        </c:forEach>
    </ul>
</div>



