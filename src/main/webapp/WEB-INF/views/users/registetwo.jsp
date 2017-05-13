<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="registe2" method="post" >
    <!--  <input type="hidden" name="method:myregiste2"> -->
    	昵称<input type="text" name="nickName" value="${reginfo.nickName}"><br>
    	头像<input type="text" name="icon" value="${reginfo.icon}" ><br>
    	性别<input type="text" name="sex" value="${reginfo.sex}"><br>
    	生日<input type="text" name="birthday" value="${reginfo.birthday}"><br>
    	地址<input type="text" name="address" value="${reginfo.address}"><br>
    	爱好<input type="text" name="hobby" value="${reginfo.hobby}"><br>
    	qq账户<input type="text" name="qqAcount" value="${reginfo.qqAcount}"><br>
    	<input type="submit" value="注册">
    </form>
</body>
</html>