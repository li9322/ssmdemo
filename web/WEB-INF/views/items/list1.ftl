<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1">
    <caption>商品列表</caption>
    <tr>
        <td>名称</td>
        <td>价格</td>
        <td>描述</td>
        <td>日期</td>
        <td>操作</td>
    </tr>
    <#list itemsList as items>
        <tr>
            <td>${items.name}</td>
            <td>${items.price}</td>
            <td>${items.detail}</td>
            <td>${items.createtime?datetime}</td>
            <td>
                <a href="/items/delete.do?id=${items.id}">删除</a>
                &nbsp;<a href="/items/edit.do?id=${items.id}">编辑</a>
            </td>
        </tr>
    </#list>

</table>
</body>
</html>
