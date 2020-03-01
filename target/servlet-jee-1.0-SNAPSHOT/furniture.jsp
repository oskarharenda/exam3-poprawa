<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: oskar
  Date: 01.03.2020
  Time: 10:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Furniture</title>
</head>
<body>

<table border="1">

    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Description</th>
    </tr>
    <form action="/furniture" method="post">
    <c:forEach items="${furniture}" var="furniture">
        <tr>
            <td>${furniture.id}</td>
            <td>${furniture.name}</td>
            <td>${furniture.description}</td>
            <td><input name="name" type="submit" value=delete></td>
        </tr>
    </c:forEach>
    </form>
</table>
</body>
</html>
