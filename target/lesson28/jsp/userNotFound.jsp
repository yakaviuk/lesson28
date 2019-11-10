<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User not found</title>
</head>
<body>
<%@include file="getinfo.jsp"%>
<p>User with Id <%=request.getSession().getAttribute("userId")%>  not found</p>
</body>
</html>
