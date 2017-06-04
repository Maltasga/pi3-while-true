<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt">
    <head>
        <title>Cadastro de Filial</title>
        <jsp:include page="../partilals/htmlHead.jsp"></jsp:include>
        </head>
        <body>
        <jsp:include page="../partilals/menu.jsp"></jsp:include>
            <div class="container form-cadastro">
                <div class="titulo">
                    <h2>Nova Filial</h2>
                </div>
                <form action="cadastrar-filial" method="POST" >
                    <div class="form-dados">
                        <input type="hidden" name="id" value="0" />
                        <div class="form-flex">
                            <div class="form-group form-razaoSocial">
                                <label>Razão Social</label>
                                <input type="text" name="razaosocial" class="form-control" required="required" />
                            </div>
                            <div class="form-group form-cnpj">
                                <label>CNPJ</label>
                                <input type="text" name="cnpj" class="form-control" required="required" />  
                            </div>
                            <div class="form-group">
                                <label>Matriz</label>
                                <input type="checkbox" name="ativo-matriz" value="false"/> 
                            </div>
                        </div>

                        <div class="form-flex">
                            <div class="form-group form-cep">
                                <label>CEP</label>
                                <input type="text" name="cep" class="form-control" required="required"/>
                            </div>
                            <div class="form-group form-logradouro">
                                <label>Logradouro</label>
                                <input type="text" name="logradouro" class="form-control" required="required"/>
                            </div>
                            <div class="form-group form-complemento">
                                <label>Complemento</label>
                                <input type="text" name="complemento" class="form-control"/>
                            </div>
                        </div>
                        <div class="form-flex">
                            <div class="form-group">
                                <label>Bairro</label>
                                <input type="text" name="bairro" class="form-control" required="required"/>
                            </div>
                            <div class="form-group">
                                <label>Cidade</label>
                                <input type="text" name="cidade" class="form-control" required="required"/>
                            </div>
                            <div class="form-group">
                                <label>UF</label>
                                <select name="uf" required class="form-control" >                                
                                    <option value=""></option>
                                <c:forEach items="${listaUF}" var="i">                                    
                                    <option value="${i}">${i}</option>
                                </c:forEach>
                            </select> 
                        </div>                       
                    </div>

                    <div id="actions" class="form-group">
                        <div class="form-botoes">
                            <button type="submit" class="btn btn-primary">Salvar</button>
                            <a href="index.html" class="btn btn-warning">Cancelar</a>
                        </div>
                    </div>
                </div>
            </form>
        </div>
        <script src="Content/lojaJs/form-filial.js" type="text/javascript"></script>
    </body>
</html>
