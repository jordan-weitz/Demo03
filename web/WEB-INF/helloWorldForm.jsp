<%-- 
    Document   : helloWorldForm
    Created on : 25-May-2021, 2:29:37 PM
    Author     : jweit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hello World Form</title>
    </head>
    <body>
        <h1>Hello World Form</h1>
        <form method="post" action="hello">
            <label>First Name</label>
            <input type="text" name="first_name">
            <br>
            <label>Last Name</label>
            <input type="text" name="last_name">
            <br>
            <input type="submit" value="Say Hello">
        </form>
    </body>
</html>
