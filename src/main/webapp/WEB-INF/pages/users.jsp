<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Users</title>
</head>
<body>
<h3>Selected user = ${userById.username}</h3>
<h3>All users details:</h3>
<c:forEach items="${userList}" var="user">
    <p>${user.username} ${user.password}</p>
</c:forEach>
<p></p>
</body>
</html>
