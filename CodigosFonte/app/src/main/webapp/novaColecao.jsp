<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <!--        <meta name="viewport" content="width=device-width, initial-scale=1">-->
        <link href="Content/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="Content/bootstrap/css/estilo.css" rel="stylesheet" type="text/css"/>
        <title>Cadastrar Coleção</title>
    </head>
    <body>
        <div class="container">
            <h2>Cadastro de Coleção</h2>
            <form>
                <div class="form-horizontal col-md-4">
                    <div  class="form-group">
                        <label>Nome da Coleção</label>
                        <input class="form-control" type="text" name="colecao"  placeholder="Nome da Coleção" >
                        <div class="form-ativo">
                           <label>Ativo</label>
                        <input type="checkbox"  name="ativo" value="ativo"> 
                        </div>
                        

                    </div>


                    <div class="form-group">
                        <label>Periodo</label>
                        <select name="periodo" class="form-control">
                            <option value="">   </option>
                            <option value="">Outono</option>
                            <option value="">Primavera</option>
                            <option value="">Verão</option>
                            <option value="">Inverno</option>                        
                        </select>
                    </div>        

                    <div class="form-group">
                        <label>Ano</label>
                        <select name="ano" class="form-control">
                            <option value="">   </option>
                            <option value="">2017</option>
                            <option value="">2016</option>
                            <option value="">2015</option>
                            <option value="">2014</option>
                            <option value="">2013</option>
                        </select>
                    </div>  


                    <div id="actions" class="row">
                        <div class="col-md-12">
                            <button type="submit" class="btn btn-primary">Salvar</button>
                            <a href="index.html" class="btn btn-warning">Cancelar</a>
                        </div>
                    </div>
                </div>
            </form>
        </div>
    </body>
</html>
