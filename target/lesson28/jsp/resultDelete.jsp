<%@ page import="entity.UserEntity" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@include file="getinfo.jsp"%>
<% boolean result = (boolean) request.getSession().getAttribute("result"); %>
<p>Result: <%= result%> </p>


</body>
</html>
