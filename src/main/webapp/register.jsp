<%--
  Created by IntelliJ IDEA.
  User: oskar
  Date: 01.03.2020
  Time: 11:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>register</title>
</head>
<body>
<form action="/register" method="post">
    <input type="checkbox" id="1" name="servlet" value="servlet">
    <label for="1"> servlet</label><br>
    <input type="checkbox" id="2" name="jsp" value="jsp">
    <label for="2"> jsp</label><br>
    <input type="checkbox" id="3" name="java" value="java">
    <label for="3"> java</label><br>
    <label>loginGithub</label> <input type="text" name="loginGit" /><br>
    <input type="submit" value="Submit">
</form>
</body>
</html>
