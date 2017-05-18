<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form  action="add.action" method="post">
		姓名：<input  name="u.name"  /> 
		<br/>
		密码：<input  name="u.pwd"  /> 
		<br/>
		年龄：<input  name="u.age"  /> 
		<br/>
		邮箱<input  name="u.email"  /> 
		<br/>
		日期<input  name="u.birthday"  /> 
		<br/>
		<input  type="submit"  value="添加">
	</form>  
</body>
</html>