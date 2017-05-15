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
                            <label>Estado</label>
                            <select name="uf" class="form-control">
                                <option value="0">Selecione o Estado</option>
                                <option value="ac">Acre</option>
                                <option value="al">Alagoas</option>
                                <option value="ap">Amapá</option>
                                <option value="am">Amazonas</option>
                                <option value="ba">Bahia</option>
                                <option value="ce">Ceará</option>
                                <option value="df">Distrito Federal</option>
                                <option value="es">Espirito Santo</option>
                                <option value="go">Goiás</option>
                                <option value="ma">Maranhão</option>
                                <option value="ms">Mato Grosso do Sul</option>
                                <option value="mt">Mato Grosso</option>
                                <option value="mg">Minas Gerais</option>
                                <option value="pa">Pará</option>
                                <option value="pb">Paraíba</option>
                                <option value="pr">Paraná</option>
                                <option value="pe">Pernambuco</option>
                                <option value="pi">Piauí</option>
                                <option value="rj">Rio de Janeiro</option>
                                <option value="rn">Rio Grande do Norte</option>
                                <option value="rs">Rio Grande do Sul</option>
                                <option value="ro">Rondônia</option>
                                <option value="rr">Roraima</option>
                                <option value="sc">Santa Catarina</option>
                                <option value="sp">São Paulo</option>
                                <option value="se">Sergipe</option>
                                <option value="to">Tocantins</option>
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
