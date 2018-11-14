<%-- 
    Document   : Search
    Created on : Nov 14, 2018, 10:18:17 AM
    Author     : hungn
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shopping</title>
    </head>
    <body>
        <h1>Product List</h1>
        <form action="productfinder">
            <span style="color: red">
                <c:out value="${param.msg}"/></span>
            <input name="name"/><input type="submit" value="Search"/>
        </form>
    </body>
</html>
