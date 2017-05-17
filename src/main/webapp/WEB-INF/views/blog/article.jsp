<%--
  Created by IntelliJ IDEA.
  User: xdzy
  Date: 17-5-15
  Time: 下午5:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <base href="<%=basePath%>">
    <title>文章</title>
</head>
<body>
<h2 align="center">${requestScope.article.title}<small>--${requestScope.article.type}</small></h2>
标签:
    <c:forEach items="${requestScope.article.getTagsArray()}" var="tag">
        ${tag}
    </c:forEach>
<br>
作者：${requestScope.article.publisher}-${requestScope.article.original}<br>
日期：${requestScope.article.date}    阅读量:${requestScope.article.readCount}<br>
<p>${requestScope.article.content}</p>
</body>
</html>
