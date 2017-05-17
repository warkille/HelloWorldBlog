<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: xdzy
  Date: 17-5-13
  Time: 下午4:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <base href="<%=basePath%>">
    <title>发表博客</title>
</head>
<body>
<form action="./blog/save.action" method="post">
    标题：<input type="text" name="title"><br>
    分类:
    <c:forEach items="${requestScope.typeList}" var="at">
        <input type="radio" name="type" value="${at.typeNumber}">${at.typeName}
    </c:forEach><br>
    标签(多个标签，用 ; 号隔开):<input type="text" name="tags"><br>
    原创： <input type="radio" name="original" value="1">是
    <input type="radio" name="original" value="0">否(请尊重原创，在文章中注明出处)<br>
    内容:<br>
    <textarea name="content" cols="80" rows="20"></textarea><br>
    <button>提交</button>
</form>
</body>
</html>
