<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update</title>
</head>
<body>
<%@include file="index.jsp" %>
<p>Result: <%= (boolean) request.getSession().getAttribute("updateResult") %> </p>
<p>User <%= (String) request.getSession().getAttribute("name") %> has been updated</p>
</body>
</html>
