window.addEventListener("load", function () {
    var produtos = [];

    function getProdutos() {
        var xhr = new XMLHttpRequest();
        xhr.open("post", "getProdutos", true);
        xhr.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
        xhr.onreadystatechange = function () {
            if (xhr.readyState === XMLHttpRequest.DONE && xhr.status === 200) {
                debugger;
                produtos.push(JSON.parse(xhr.responseText));
            }
        }
        xhr.send();
    }
    
    getProdutos();
});


