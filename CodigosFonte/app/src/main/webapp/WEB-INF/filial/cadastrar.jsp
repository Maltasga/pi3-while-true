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
                <h2>
                    Cadastro de Filial
                </h2>
            </div>
            <div class="width: 70%;">
                <form action="cadastrar-filial" method="POST" class="form-dados">
                    <input type="hidden" name="id" value="0" />
                    <div class="form-group text-justify">
                        <label>Razão Social</label>
                        <input type="text" name="razaosocial" class="form-control" required="required" />
                        <label>CNPJ</label>
                        <input type="text" name="cnpj" class="form-control" required="required" />
                        <label>Ativo</label>
                        <input type="checkbox" name="ativo" value="true" checked="checked"/>
                        <label>Matriz</label>
                        <input type="checkbox" name="ativo-matriz" value="false"/>
                    </div>
                    <div class="form-group">
                        <label>Logradouro</label>
                        <input type="text" name="logradouro" class="form-control" required="required"/>
                        <label>CEP</label>
                        <input type="text" name="cep" class="form-control" required="required"/>
                    </div>
                    <div class="form-group">
                        <label>Complemento</label>
                        <input type="text" name="complemento" class="form-control"/>
                    </div>
                    <div class="form-group">
                        <label>Bairro</label>
                        <input type="text" name="bairro" class="form-control" required="required"/>
                        <label>Cidade</label>
                        <input type="text" name="cidade" class="form-control" required="required"/>
                        <label>Estado</label>
                        <select name="uf">
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
                    <div class="form-group text-right">
                        <input type="submit" class="btn btn-primary" value="Salvar" />
                        <input type="reset" class="btn btn-warning" value="Cancelar" />
                    </div>
                </form>
            </div>
        </div>
    </body>
</html>
