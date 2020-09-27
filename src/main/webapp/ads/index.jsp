<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<ul>
    <c:forEach var="ad" items="${ads}">
        <li>${ad.title}</li>
        <li>${ad.description}</li>
    </c:forEach>
</ul>

</body>
</html>
