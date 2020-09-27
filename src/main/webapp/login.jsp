<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    if (request.getParameter("username") != null && request.getParameter("username").equals("admin") && request.getParameter("password") != null && request.getParameter("password").equals("password")) {
        response.sendRedirect("/profile.jsp");

    } else {
        response.sendRedirect("/login.jsp");
    }

%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="POST" action="/login.jsp">

    <label for="username">Username</label>
    <input id="username" name="username" type="text">
    <br>

    <label for="password">Password</label>
    <input id="password" name="password" type="password">
    <br>

    <input type="submit">
</form>
</body>
</html>
