<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@include file="index.jsp"%>
<p>Result: <%= (boolean) request.getSession().getAttribute("createResult") %> </p>
<p>User <%= (String) request.getSession().getAttribute("name") %> has been created</p>
</body>
</html>
