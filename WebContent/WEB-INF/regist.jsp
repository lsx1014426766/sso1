<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
//basePath= http://localhost:8080/struts1103/
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- 配置基路径  每次相对路径都会相对这个路径在变化 -->
<base  href="<%=basePath %>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<form action="user/regist" method="post">
		用户名：<input  name="name"  />
		<br/>
		密码：<input  name="pwd"  />
		<br/>
		邮箱：<input  name="email"/>
		<br/>
		日期：<input  name="birthday"/>
		<br/>
		<input  type="submit"  value="注册"/>
	</form>
	
	  

</body>
</html>