<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="menu">
<!--    <img src="<c:url value="/Content/img/logo.png"/>" class="logo" alt="logo da empresa" />-->
    <ul class="nav nav-pills menu-itens">
        <li role="presentation" class="active">
            <a href="home" aria-controls="home" role="tab" data-toggle="tab">Home</a>
        </li>
        <c:forEach items="${menus}" var="m">
            <li role="presentation">
                <a href="${m.caminho}" role="tab" data-toggle="tab">
                    ${m.nome}
                </a>
            </li>
        </c:forEach>
        <li role="presentation" class="menu-usuario">
            <c:out value="${usuario.nome}"></c:out>
                | 
            <c:out value="${usuario.perfil.nome}"></c:out>
            | 
            <label id="logout">sair</label>
        </li>
    </ul>
</div>
<script type="text/javascript">
    window.addEventListener("load", function () {
        var logout = document.querySelector("#logout");
        logout.style.cursor = "pointer";

        logout.addEventListener("click", function () {
            var form = document.createElement("form");
            form.method = "post";
            form.action = "logout";
            this.appendChild(form);
            form.submit();

        });
    });
</script>