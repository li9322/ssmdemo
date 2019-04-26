<%--
  Created by IntelliJ IDEA.
  User: LBL
  Date: 2019/04/26,0026
  Time: 13:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<script>
    document.write("<h1>this is a heading </h1>")
    document.write("<p>this is a paragraph </p>")

    function myFunction() {
        var carname="volvo"
        x=document.getElementById("demo")
        x.innerHTML=carname
    }
    function changeImage() {
        element=document.getElementById("myimage")
        if (element.src.match("bulbon")) {
            element.src="http://www.w3school.com.cn/i/eg_bulbon.gif"
        }else {
            element.src="http://www.w3school.com.cn/i/eg_bulboff.gif"
        }
    }
</script>
<body>
<h1 id="demo">this is a test case</h1>
<button type="button" onclick="alert('welcome!')">点击</button>
<button type="button" onclick="myFunction()">点击这里</button>
<img id="myimage" onclick="changeImage()" src=" http://www.w3school.com.cn/i/eg_bulbon.gif">
<p>点击灯泡进行开关</p>
</body>
<script>
    var person=new Object()
    person.firstname="bill"
    person.lastname="Gates"
    person.age=57
    person.eyecolor="blue"
    alert(person)
</script>
</html>
