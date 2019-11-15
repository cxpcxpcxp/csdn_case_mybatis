<%--
  Created by IntelliJ IDEA.
  User: miao
  Date: 2019/11/4
  Time: 20:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>spring-mvc和spring的整合</title>
</head>
<body>
<h4>恭喜springmvc测试成功</h4>
<form action="/user/userHello" method="post">
用户名：<input type="text" name="name">
密  码：<input type="text" name="pwd">
        <input type="submit">
</form>
<br>
<a href="/user/userList">用户列表展示</a>
</body>
</html>
