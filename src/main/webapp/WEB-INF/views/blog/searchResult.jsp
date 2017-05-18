<%--
  Created by IntelliJ IDEA.
  User: xdzy
  Date: 17-5-17
  Time: 下午4:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <base href="<%=basePath%>">
    <title>搜索结果</title>
</head>
<body>
<ul>
    <c:forEach items="${requestScope.result.items}" var="item">
        <li>
            <img width="80px" height="80px" src="${item.getUserIconUrl()}">
                ${item.publisher}<br>
            <a href="${item.getArticleLink()}">${item.title}</a>
                ${item.date}
            <br>
            <p>${item.detail}</p>
            <br>
            <c:forEach items="${item.getTagsArray()}" var="tag">
                ${tag}
            </c:forEach>
            浏览量:${item.readCount}
        </li>
    </c:forEach>
</ul>
</body>
</html>
