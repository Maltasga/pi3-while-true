<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="../partilals/htmlHead.jsp"></jsp:include>
            <title>Venda</title>
            <style>
                .container-pdv {
                    width: 920px;
                    border: 1px #777 solid;
                    background: #F8F8FF;
                    box-sizing: border-box;
                    margin: auto;
                    position: fixed;
                    left: 35px;
                    top: 25px;
                    border-radius: 30px;
                    opacity: 0.9;
                }
                .container-pdv .header {
                    padding: 20px;
                    font-size: 25px;
                }
                .header p:nth-of-type(2) {
                    font-size: 20px;
                    margin: auto 30px;
                }

                .container-pdv .corpo {
                    padding: 20px;
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
                        <div class="form-group">
                            <label id="lblNomeProduto" style="display: inline-block"></label>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>