<%-- 
    Document   : agecalculator.jsp
    Created on : Sep 13, 2019, 3:20:00 PM
    Author     : 794471
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        
        <form action="age" method="post"> 
            Enter your age: <input type="text" value="${currentAge}" name="ageInput">
            <br>
            <input type="submit" value="Age next birthday" >
            <br>
        </form>
        
        <div>${newAge}</div>
            
        <a href="arithmetic"> Arithmetic Calculator</a>
    </body>
</html>
