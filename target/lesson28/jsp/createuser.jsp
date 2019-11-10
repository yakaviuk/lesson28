<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create</title>
</head>
<body>
<%@include file="index.jsp"%>
<form action="controllercreate" method="POST">
    <h4>Create user:</h4>
    <label for="name"><b>Enter user name: </b></label>
    <input type="text" placeholder="name" name="name" required>
    <p></p>
    <label for="age"><b>Enter user age: </b></label>
    <input type="number" placeholder="age" name="age" required>
    <p></p>
    <input type="submit" value="Create"></input>
</form>
</body>
</html>
