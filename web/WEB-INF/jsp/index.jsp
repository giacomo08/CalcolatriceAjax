<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        
        <script src="./resources/calcolatrice_get.js"   type="text/javascript"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calcolatrice parametri passati con metotodo GET</title>
    </head>

    <body>
        <h2>Calclatrice con parametri GET</h2>
        <label>Primo numero: <input type="text" maxlength="20" size="20" id="num1" /></label><br/><br/>
        <label>Secondo numero: <input type="text" maxlength="20" size="20" id="num2" /></label><br/><br/>
        <button value="+" onclick="calcola('+')" name="btn-plus" >+</button>
        <button value="-" onclick="calcola('-')" name="btn-minus" >-</button>
        <button value="*" onclick="calcola('*')" name="btn-per" >*</button>
        <button value="/" onclick="calcola('/')" name="btn-div" >/</button>
        <br/><br/>
        <div id="risultato"></div>
        <br/><br/>
        <a href="./calcolatricePost">Vai a calcolatrice POST...</a>
    </body>
</html>
