window.addEventListener("load", function () {
    var btnNovo = document.querySelector("#btnNovoUsuario");
    btnNovo.addEventListener("click", function () {
        window.location = "novousuario";
    });

    var botoesEdicao = document.querySelectorAll(".btn-editar");
    for (var i = 0; i < botoesEdicao.length; i++) {
        var btn = botoesEdicao[i];
        btn.style.cursor = "pointer";
        btn.addEventListener("click", function () {
            var id = this.getAttribute("data-id");
            alert("usuarioID: " + id);
        });
    }

    var botoesExclusao = document.querySelectorAll(".btn-excluir");
    for (var i = 0; i < botoesExclusao.length; i++) {
        var btn = botoesExclusao[i];
        btn.style.cursor = "pointer";
        btn.addEventListener("click", function () {
            if(confirm("Deseja excluir este usuário?")){
                
             this.parent.parent.remove();   
            }
        });
    }
});