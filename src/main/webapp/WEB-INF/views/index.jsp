<%--
  Created by IntelliJ IDEA.
  User: xdzy
  Date: 2017/5/3
  Time: 17:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
    <base href="<%=basePath%>">
    <title>首页</title>
</head>
<body>

<h1>首页</h1> <c:if test="${not empty loginUser}">欢迎你${loginUser.username}</c:if>

<h4>以下是测试信息</h4>
${requestScope.test.name}--${requestScope.test.date}

<div style="border: solid 1px #000;width: 400px">
    <h3>分类浏览文章</h3>
    <c:forEach items="${requestScope.typeList}" var="at">
        <a href="<c:url value="${at.getUrl()}"/>">${at.typeName}</a>
    </c:forEach>
</div>
<br>

<a href="/blog/test">Blog-Test</a>
<a href="/user/test">UserTest</a>

</body>
</html>
