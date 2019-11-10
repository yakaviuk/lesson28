<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome page</title>
</head>
<body>
<%@include file="index.jsp"%>
<form action="controller" method="POST">
    <label for="userId"><b>Enter user Id: </b></label>
    <input type="number" placeholder="user Id" name="userId" required>
    <p></p>
    <input type="submit" value="Get info"></input>
</form>
</body>
</html>
