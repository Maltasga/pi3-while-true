window.addEventListener("load", function () {
    document.querySelector("input[type=reset]")
            .addEventListener("click", function () {
                window.location = "usuarios";
            });

    document.querySelector("input[type=submit]")
            .addEventListener("click", function (event) {
                event.preventDefault();
                var senha = document.querySelector("input[name=senha]");
                var confirmacao = document.querySelector("#txtConfirmarSenha");

                if (senha.value !== confirmacao.value) {
                    alert("As senhas digitadas não conferem!");
                    return;
                }else{
                    document.querySelector("form").submit();
                }
            });
});


