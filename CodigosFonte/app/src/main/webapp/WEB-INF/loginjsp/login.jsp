<!DOCTYPE html>
<html>
    <head>
        <title>While True</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="Content/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="Content/css/login.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="container-login">
            <div class="titulo text-center">
                <label>Autentique-se</label>
            </div>
            <form action="login" method="post">
                <div class="form-group">
                    <label>Usu�rio</label>
                    <input type="text" name="usuario" class="form-control"/>
                </div>
                <div class="form-group">
                    <label>Senha</label>
                    <input type="password" name="senha" class="form-control" />
                </div>
                <div class="text-right">
                    <button type="submit" class="btn btn-primary">Enviar</button>
                </div>
            </form>
        </div>
    </body>
</html>
