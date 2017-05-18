<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">

<title>Insert title here</title>
<script type="text/javascript">
// 切换验证码
function change() {
	document.getElementById("myimg").src = "./CreateCheckCode.action?"+ new Date().getTime();
}</script>
</head>
<body>
    <form action="login" method="post">
    	用户名<input type="text" name="username" /><br>
    	密码 <input type="password" name="password" /><br>
    	验证码<input type="text" name="checkcode" /><img id="myimg"
		src="./CreateCheckCode.action" style="cursor: pointer;" onclick="change();" /><br>
			
    <input type="submit" value="登陆">
    </form>
</body>
</html>