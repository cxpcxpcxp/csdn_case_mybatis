<%--
  Created by IntelliJ IDEA.
  User: miao
  Date: 2019/11/5
  Time: 16:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>用户列表展示</title>
</head>
<body>
<table border="1px" align="center">
    <tr>
        <td>id</td>
        <td>用户名</td>
        <td>密码</td>
    </tr>

    <c:forEach  items="${list}" var="i">
        <tr>
            <td>${i.id}</td>
            <td>${i.name}</td>
            <td>${i.pwd}</td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
