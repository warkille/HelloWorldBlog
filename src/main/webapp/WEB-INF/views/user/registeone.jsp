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
</head>
<body>
 <form action="./user/registeone.action" method="post">
    <!--  <input type="hidden" name="method:registeone"> -->
    	<table>
			<tr>
				<td>用户名</td>
				<td><input type="text" name="username"  /></td>
			</tr>
			<tr>
				<td>密码</td>
				<td><input type="password" name="password"  /></td>
			</tr>
			<tr>
				<td>确认密码</td>
				<td><input type="password" name="repassword"  /></td>
			</tr>
		
			<tr>
				<td>邮箱</td>
				<td><input type="text" name="email" /></td>
			</tr>
			
			<!-- <tr>
				<td>验证码</td>
				<td><input type="text" name="checkcode" /><img id="myimg"
					src="../src/com/helloworld/blog/user/controller/CheckCodeAction.checkcodes" style="cursor: pointer;" onclick="change();" /></td>
			   </tr> 
			<tr> -->
				<td><input type="submit" value="下一步" /></td>
				<td>
					<!-- 登陆 链接登陆页面 ，返回  返回之前页面 --> <input type="button" value="返回"
					onclick="history.go(-1);" />
				</td>
			</tr>
		</table>
    </form>
</body>
</html>