function calcola(op) {
    //prendo il valore dei campi di input
    var n1 = document.getElementById("num1");
    var n2 = document.getElementById("num2");
    var num1 = parseFloat(n1.value);
    var num2 = parseFloat(n2.value);
    if (n1.value == '') {
        n1.value = 1;
        num1 = 1;
    }
    if (n2.value == '') {
        n2.value = 1;
        num2 = 1;
    }
    //mando le info al server 
    var param = "num1="+num1+"&num2="+num2+"&op="+op;
    var request = new XMLHttpRequest();
    //uso una funzione anonima javascript
    request.onreadystatechange = function () {
        showResponseText(request);
    };
    request.open("GET", "calcolatrice_Get?"+param, true);
    request.send();
}


function showResponseText(request) {
    if ((request.readyState === 4) && (request.status === 200)) {
        htmlInsert(request.responseText);
    }
}

//Insert the html data into the element that has the specified id.

function htmlInsert(htmlData) {
    document.getElementById("risultato").innerHTML = htmlData;
}


