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
    <title>编辑商品</title>
</head>
<script src="${pageContext.request.contextPath}/js/jquery-1.8.3.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery.form.js"></script>
<script>
    function submitImage() {
        alert("提交图片到后台")
        //封装请求
        var options={
            type:'post',
            url:'${pageContext.request.contextPath}/upload/itemspic.do',
            success:function (respData) {
                console.log(respData);
            }
        }
        $('#itemsForm').ajaxSubmit(options)
    }
</script>
<body>
<form id="itemsForm" action="${pageContext.request.contextPath}/items/update.do" method="post">
    <table border="1">
        <caption>编辑商品</caption>
        <tr>
            <td>名称</td>
            <td><input type="text" name="name" value="${items.name}"></td>
            <td><input type="hidden" name="id" value="${items.id}"></td>
        </tr>
        <tr>
            <td>价格</td>
            <td><input type="text" name="price" value="${items.price}"></td>
        </tr>
        <tr>
            <td>详情</td>
            <td><textarea cols="20" rows="5" name="detail" >${items.detail}</textarea></td>
        </tr>
        <tr>
            <td>图片</td>
            <td>
                <img src="${items.pic}" width="100px" height="100px"/>
                <input type="file" name="itemspic1" onchange="submitImage()">
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="更新">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
