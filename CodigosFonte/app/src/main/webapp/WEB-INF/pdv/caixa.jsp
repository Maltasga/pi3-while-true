<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>PDV - CoolWear</title>
        <jsp:include page="../partilals/htmlHead.jsp"></jsp:include>
            <link href="Content/css/pdv.css" rel="stylesheet" type="text/css" />
        </head>
        <body>
            <div class="container">
                <div class="container-pdv">
                    <div class="header">
                        <p>
                            Venda em andamento - <fmt:formatDate pattern="dd/MM/yyyy" value="${hoje}"></fmt:formatDate>
                        </p>
                        <p>
                            <b>Cliente:</b> ${cliente.nome} <b>CPF:</b> ${cliente.cpf}
                    </p>
                </div>
                <hr />
                <div class="corpo">
                    <div class="col-md-10">
                        <div class="form-group">
                            <label for="codProduto">
                                <input  type="radio" id="codProduto" name="busca" value="c" checked="checked" />
                                Cód. Produto
                            </label>
                            <label for="nmProduto">
                                <input  type="radio" id="nmProduto" name="busca" value="n" />
                                Nome
                            </label>
                            <div class="form-inline">
                                <input type="text" id="txtCodProduto" class="form-control" />
                                <span class="glyphicon glyphicon-search"></span>
                            </div>
                        </div>
                        <div class="form-inline">
                            <div class="form-group">
                                <label>
                                    Descrição
                                </label>
                                <br />
                                <span>
                                    Camiseta fantasia
                                </span>
                            </div>
                            <div class="form-group">
                                <label>
                                    Valor
                                </label>
                                <br />
                                <span>
                                    <fmt:formatNumber type="currency" value="15.0"></fmt:formatNumber>
                                </span>
                            </div>
                            <div class="form-group">
                                <label>
                                    Cor
                                </label>
                                <br />
                                <select class="form-control">
                                    <option value=""></option>
                                </select>
                            </div>
                            <div class="form-group">
                                <label>
                                    Tamanho
                                </label>
                                <br />
                                <select class="form-control">
                                    <option value=""></option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label>&nbsp;</label>
                            <br />
                            <input type="button" value="Adicionar" class="btn btn-sm btn-default" />
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <script src="Content/lojaJs/pdv-emandamento.js"></script>
    </body>
</html>