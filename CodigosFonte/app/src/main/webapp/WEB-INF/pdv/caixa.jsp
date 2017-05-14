<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>PDV - CoolWear</title>
        <jsp:include page="../partilals/htmlHead.jsp"></jsp:include>
            <link href="Content/css/pdv.css" rel="stylesheet" type="text/css" />
            <link href="Content/autocomplete/autocomplete.min.css" rel="stylesheet" type="text/css" />
            <style type="text/css">
                .container div:first-of-type {
                    width: auto;
                }
            </style>
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
                    <div class="form-inline">
                        <div class="form-group">
                            <label for="codProduto">
                                Pesquise o nome
                            </label>
                            <br />
                            <input type="text" id="txtIdentProduto" class="form-control" />
                        </div>
                        <div class="form-group">
                            <label>
                                Descrição
                            </label>
                            <br />
                            <span id="lblDescricao">
                                &nbsp;
                            </span>
                        </div>
                        <div class="form-group">
                            <label>
                                Valor unit.
                            </label>
                            <br />
                            <span id="lblValor">
                                &nbsp;
                            </span>
                        </div>
                        <div class="form-group">
                            <label>
                                Cor
                            </label>
                            <br />
                            <span id="lblCor">
                                &nbsp;
                            </span>
                        </div>
                        <div class="form-group">
                            <label>
                                Quantidade
                            </label>
                            <br />
                            <input id="txtQtde" type="number" class="form-control" />
                        </div>
                        <div class="form-group">
                            <label>
                                Tamanho
                            </label>
                            <br />
                            <select id="ddlTamanho" class="form-control">
                                <option value=""></option>
                                <option value="PP">PP</option>
                                <option value="P">P</option>
                                <option value="M">M</option>
                                <option value="G">G</option>
                                <option value="GG">GG</option>
                            </select>
                        </div>
                        <div class="form-group">
                            <label>&nbsp;</label>
                            <br />
                            <input id="btnAddItem" type="button" value="Adicionar" class="btn btn-sm btn-default" />
                        </div>
                    </div>
                    <hr/>
                    <table id="listaItens" class="table table-striped">
                        <thead>
                            <tr>
                                <th colspan="6" class="text-capitalize text-center">
                                    Itens
                                </th>
                            </tr>
                            <tr>
                                <th>
                                    Nome
                                </th>
                                <th>
                                    Tamanho
                                </th>
                                <th>
                                    Valor Unit.
                                </th>
                                <th>
                                    Quantidade
                                </th>
                                <th>
                                    Valor Total
                                </th>
                                <th>
                                </th>
                            </tr>
                        </thead>
                        <tbody>
                            
                        </tbody>
                    </table>

                </div>
            </div>
        </div>
        <script src="Content/jquery.min.js" type="text/javascript"></script>
        <script src="Content/autocomplete/autocomplete.min.js" type="text/javascript"></script>
        <script src="Content/lojaJs/pdv-emandamento.js"></script>
    </body>
</html>