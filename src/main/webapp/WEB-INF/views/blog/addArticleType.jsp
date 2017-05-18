<%--
  Created by IntelliJ IDEA.
  User: xdzy
  Date: 17-5-12
  Time: 下午10:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/blog/addToDB" method="post">
    <label for="type">请输入新分类</label> <input type="text" name="type" id="type"><br>
    <label for="typeName">请输入新分类名称</label> <input type="text" name="typeName" id="typeName"><br>
    <button>提交</button>
</form>
</body>
</html>
