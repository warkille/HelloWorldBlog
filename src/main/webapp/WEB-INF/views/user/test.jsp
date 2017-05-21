<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<title>Insert title here</title>
</head>
<body>
<a href="<c:url value="/home"/>">To IndexPage</a>
<a href="<c:url value="/user/toLogin.action"/> ">登录</a>
<a href="<c:url value="/user/toRegiste.action"/> ">注册</a><br>
</body>
</html>