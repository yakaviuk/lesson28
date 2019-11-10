<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome page</title>
</head>
<body>
<%@include file="index.jsp"%>
<form action="controllerdel" method="POST">
    <label for="userId"><b>Enter user Id for delete: </b></label>
    <input type="number" placeholder="user Id" name="userId" required>
    <p></p>
    <input type="submit" value="Delete"></input>
</form>
</body>
</html>
