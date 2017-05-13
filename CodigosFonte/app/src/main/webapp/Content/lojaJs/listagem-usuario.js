window.addEventListener("load", function () {
    var btnNovo = document.querySelector("#btnNovoUsuario");
    btnNovo.addEventListener("click", function () {
        window.location = "cadastrar-usuario";
    });

    var botoesEdicao = document.querySelectorAll(".btn-editar");
    for (var i = 0; i < botoesEdicao.length; i++) {
        var btn = botoesEdicao[i];
        btn.style.cursor = "pointer";
        btn.addEventListener("click", function () {
            var id = this.getAttribute("data-id");
            window.location = "editar-usuario?q=" + id;            
        });
    }

    var botoesExclusao = document.querySelectorAll(".btn-excluir");
    for (var i = 0; i < botoesExclusao.length; i++) {
        var btn = botoesExclusao[i];
        btn.style.cursor = "pointer";
        btn.addEventListener("click", function () {
            if (confirm("Deseja excluir este usuário?")) {
                var id = this.getAttribute("data-id");
                var xhr = new XMLHttpRequest();
                xhr.open("post", "excluirusuario", true);
                xhr.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
                xhr.onreadystatechange = function () {
                    if (xhr.readyState === XMLHttpRequest.DONE && xhr.status === 200) {
                        debugger;
                        this.parentElement.parentElement.remove();
                    }
                }
                xhr.send("q=" + id);
            }
        });
    }
});