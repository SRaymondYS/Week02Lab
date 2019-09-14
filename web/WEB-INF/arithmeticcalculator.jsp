<%-- 
    Document   : arithmeticcalculator
    Created on : Sep 13, 2019, 4:12:59 PM
    Author     : 794471
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        
        <form action="arithmetic" method="post"> 
            First: <input type="text" value="${num1}" name="numOne">
            <br>
            Second: <input type="text" value="${num2}" name="numTwo">
            <br>
            <input type="submit" value="+" name="operation">
            <input type="submit" value="-" name="operation">
            <input type="submit" value="*" name="operation">
            <input type="submit" value="%" name="operation">
        </form>
        
        <br>
        Result: ${result}
        <br>
        <a href="/age"> Age Calculator</a>
    </body>
</html>
