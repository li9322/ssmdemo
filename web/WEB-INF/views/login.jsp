<%--
  Created by IntelliJ IDEA.
  User: li
  Date: 2019/5/4/0004
  Time: 11:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<form id="loginForm" action="${pageContext.request.contextPath}/login.do" method="post">
    用户名：<input type="text" name="username">
    密码：<input type="password" name="password">
    <input type="submit" value="登录">
</form>
</body>
</html>
