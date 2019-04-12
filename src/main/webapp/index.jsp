<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach var="user" items="${requestScope.list}">
    ${user.id}${user.name}${user.password}<br/>
</c:forEach>
</body>
</html>
