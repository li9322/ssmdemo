<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: li
  Date: 2019/4/25/0025
  Time: 20:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table border="1">
        <caption>商品列表</caption>
        <tr>
            <td>名称</td><td>价格</td><td>描述</td><td>日期</td><td>操作</td>
        </tr>
        <c:forEach items="${itemList}" var="items">
            <tr>
                <td>${items.name}</td>
                <td>${items.price}</td>
                <td>${items.detail}</td>
                <td>${items.createtime}</td>
                <td>
                    <a href="${pageContext.request.contextPath}/items/delete.do?id=${items.id}">删除</a>
                    <a href="${pageContext.request.contextPath}/items/edit.do?id=${items.id}">编辑</a>
                </td>

            </tr>
        </c:forEach>
    </table>
</body>
</html>
