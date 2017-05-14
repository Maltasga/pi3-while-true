function xhrRequest(url, tipo, data, callback) {
    var xhr = new XMLHttpRequest();
    xhr.open(tipo, url, true);
    xhr.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
    xhr.onreadystatechange = function () {
        if (xhr.readyState === XMLHttpRequest.DONE && xhr.status === 200) {
            if (typeof callback === "function")
                callback(xhr.responseText);
        }
    }
    if (data) {
        var queryString = "";
        for (var i in data) {
            if (data.hasOwnProperty(i))
                queryString += i + "=" + data[i] + "&";
        }
        xhr.send(queryString);
    } else {
        xhr.send();
    }
}