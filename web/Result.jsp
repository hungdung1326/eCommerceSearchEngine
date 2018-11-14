<%-- 
    Document   : Result
    Created on : Nov 14, 2018, 10:21:49 AM
    Author     : hungn
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List Product</title>
    </head>
    <body>
        <h1>List Product</h1>
        <a href="Search.jsp">Search</a>
        <jsp:useBean class="com.hung.model.ProductFinderBean" id="finder" scope="request"/>
        <table>
            <tr>
                <td>Id</td>
                <td>Name</td>
                <td>Description</td>
            </tr>
            <c:forEach items="${finder.products}" var="product"> 
                <tr>
                    <td><c:out value="${product.id}"/></td>
                    <td><c:out value="${product.name}"/></td>
                    <td><c:out value="${product.des}"/></td>
                </tr>
            </c:forEach>

        </table>
    </body>
</html>
