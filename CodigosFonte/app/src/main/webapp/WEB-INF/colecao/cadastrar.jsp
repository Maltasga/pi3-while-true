<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="../partilals/htmlHead.jsp"></jsp:include>
            <title>Coleção</title>
        </head>
        <body>
        <jsp:include page="../partilals/menu.jsp"></jsp:include>
            <div class="container form-cadastro">
                <div class="titulo">
                     <h2><c:out value="${tituloColecao}"></c:out></h2>     
                </div>
                <form method="POST">
                    <div class="form-dados">
                        <div  class="form-group form-colecao">
                            <label>Nome da Coleção</label>
                            <input type="text" required name="colecao" class="form-control" placeholder="Nome da Coleção" >
                        </div>

                        <div class="form-flex">
                            <div class="form-group form-periodo">
                                <label>Periodo</label>
                                <select name="periodo" class="form-control" required >
                                    <option value="">   </option>
                                    <option value="">Outono</option>
                                    <option value="">Primavera</option>
                                    <option value="">Verão</option>
                                    <option value="">Inverno</option>                        
                                </select>
                            </div>

                            <div class="form-group form-ano">
                                <label>Ano</label>
                                <select name="ano" class="form-control" required >
                                    <option value="">   </option>
                                    <option value="">2017</option>
                                    <option value="">2016</option>
                                    <option value="">2015</option>
                                    <option value="">2014</option>
                                    <option value="">2013</option>
                                </select>
                            </div>
                        </div>
                        <div id="actions" class="row form-group">
                            <div class="form-botoes">
                                <button type="submit" class="btn btn-primary">Salvar</button>
                                <a href="index.html" class="btn btn-warning">Cancelar</a>
                            </div>
                        </div>
                    </div>
                </form>
            </div>
<!--            <footer>
            <jsp:include page="/WEB-INF/partilals/rodape.jsp"></jsp:include>
        </footer>-->
    </body>
</html>
