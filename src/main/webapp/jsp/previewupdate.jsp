<%@ page import="entity.UserEntity" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update</title>
</head>
<body>
<%@include file="index.jsp" %>
<% UserEntity userEntity = (UserEntity) request.getSession().getAttribute("userEntity"); %>

<form action="controllerresult" method="POST">

    <h4>Update user:</h4>
    <input type="hidden" type="number"  placeholder="userId" name="userId" value="<%= userEntity.getUserId()%>" required>
    <p></p>
    <%--<label for="userId"><b>Enter user Id: </b></label>--%>
    <%--<input type="number" placeholder="userId" name="userId" value="<%= userEntity.getUserId()%>" required>--%>
    <%--<p></p>--%>
    <label for="name"><b>Enter user name: </b></label>
    <input type="text" placeholder="name" name="name" value = "<%= userEntity.getName()%>" required>
    <p></p>
    <label for="age"><b>Enter user age: </b></label>
    <input type="number" placeholder="age" name="age" value = "<%= userEntity.getAge()%>" required>
    <p></p>
    <input type="submit" value="Update without backup"></input>
</form>
</body>
</html>
