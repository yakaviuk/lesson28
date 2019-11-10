<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update</title>
</head>
<body>
<%@include file="index.jsp"%>
<form action="controllerupd" method="POST">
    <label for="userId"><b>Enter user Id for update: </b></label>
    <input type="number" placeholder="user Id" name="userId" required>
    <p></p>
    <input type="submit" value="Get info and update"></input>
</form>
</body>
</html>
