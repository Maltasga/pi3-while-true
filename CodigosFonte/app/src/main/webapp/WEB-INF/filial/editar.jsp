<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
                    <h2>Manutenção de filial</h2>
                </div>
                <div style="width: 70%;">
                    <form method="post" action="editar-filial" class="form-dados">
                        <input type="hidden" name="id" value="${filial.id}" />
                    <div class="form-group text-justify">
                        <label>Razão Social</label>
                        <span>${filial.nome}</span>
                        <label>CNPJ</label>
                        <span>${filial.cnpj}</span>
                        <c:if test="${filial.ativo}">
                            <span class="glyphicon glyphicon-check"></span>
                        </c:if>
                        <label for="chkAtivo">Ativo</label>
                        <c:if test="${filial.matriz}">
                            <span class="glyphicon glyphicon-check"></span>
                        </c:if>
                        <label for="chkAtivoMatriz">Matriz</label>
                        <label>Data de Cadastro</label>
                        <span><fmt:formatDate value="${filial.dataCadastro}" pattern="dd/MM/yyyy"></fmt:formatDate></span>
                            <div class="form-group">
                                <label>Logradouro</label>
                                <input type="text" name="logradouro" class="form-control" required="required" value="${endereco.logradouro}"/>
                            <label>CEP</label>
                            <input type="text" name="cep" class="form-control" required="required" value="${endereco.cep}"/>
                        </div>
                        <div class="form-group">
                            <label>Complemento</label>
                            <input type="text" name="complemento" class="form-control" value="${endereco.complemento}"/>
                        </div>
                        <div class="form-group">
                            <label>Bairro</label>
                            <input type="text" name="bairro" class="form-control" required="required" value="${endereco.bairro}"/>
                            <label>Cidade</label>
                            <input type="text" name="cidade" class="form-control" required="required" value="${endereco.cidade}"/>
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
                    </div>
                    <div class="form-group text-right">
                        <input type="submit" value="Salvar" class="btn btn-primary" />
                        <a href="index.html" class="btn btn-warning">Cancelar</a>
                    </div>
                </form>
            </div>
        </div>
    </body>
</html>
