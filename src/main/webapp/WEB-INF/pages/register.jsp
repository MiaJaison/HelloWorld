<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="../static/style/style.css">
</head>
<body>
<div align="center">
    <div style="width: 300px; height: 500px;">
        <form:form method="POST" action="/register" modelAttribute="user">
            <div class="imgcontainer">
                <img src="../static/pictures/incognito.jpg" alt="Avatar" class="avatar">
            </div>
            <h3 align="center" style="color:maroon;">Hey, dude! Log in, please</h3>

            <div class="container" align="left">
                <form:label path="username">Username</form:label>
                <form:input type="text" name="username" required="required" path="username"/>

                <form:label path="password">Password</form:label>
                <form:input type="password" name="password" required="required" path="password"/>

                <form:label path="age">Age</form:label>
                <form:input type="number" name="age" required="required" path="age"/>

                <form:input type="radio" name="gender" value="FEMALE" path="gender"> FEMALE
                <form:input type="radio" name="gender" value="MALE" path="gender"> MALE
                <br>

                <p style="color:red">${error}</p>
                <button type="submit">Login</button>
            </div>
        </form:form>
    </div>
</div>
</body>
</html>
