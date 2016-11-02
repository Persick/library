<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Daria
  Date: 21.10.2016
  Time: 0:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Library</title>
</head>
<body>

<table border="1">
    <c:forEach items="${books}" var="book">
        <tr>
            <td>${book.id}</td>
            <td><c:out value="${book.name}"/></td>
            <td>
                <a href="delete?id=${book.id}">
                    <img src="delete.png"/>
                </a>
            </td>
        </tr>
    </c:forEach>

    <form action="/add" method="POST">
        <tr>
            <td colspan="2">
                <input name='txt' type="text">
            </td>
            <td>
                <input type="submit">
            </td>
        </tr>
    </form>
</table>

</body>
</html>
