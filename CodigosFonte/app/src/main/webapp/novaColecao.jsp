<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Coleção</title>
        <jsp:include page="WEB-INF/partilals/htmlHead.jsp"></jsp:include>
        </head>
        <body>
        <jsp:include page="WEB-INF/partilals/menu.jsp"></jsp:include>
            <div class="container">
                <div class="titulo">
                    <h2>Cadastro de Coleção</h2>   
                </div>

                <form>
                    <div class="form-horizontal">
                        <div  class="form-group form-colecao">
                            <label>Nome da Coleção</label>
                            <input pattern="[a-zA-Z]+" type="text" required name="colecao" class="form-control" placeholder="Nome da Coleção" >
                            <div class="form-ativo">
                                <label>Ativo</label>
                                <input type="checkbox"  name="ativo" value="ativo"> 
                            </div>
                        </div>

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

                        <div id="actions" class="row form-group">
                            <div>
                                <button type="submit" class="btn btn-primary">Salvar</button>
                                <a href="index.html" class="btn btn-warning">Cancelar</a>
                            </div>
                        </div>

                    </div>
                </form>
            </div>
            <footer>
            <jsp:include page="/WEB-INF/partilals/rodape.jsp"></jsp:include>
        </footer>
    </body>
</html>
