<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form  action="update.action" method="post">
		<input  type="hidden"  name="user.id" value="${u.id}">
		姓名：<input  name="user.name"  value="${u.name }"  /> 
		<br/>
		密码：<input  name="user.pwd"   value="${u.pwd }" /> 
		<br/>
		年龄：<input  name="user.age"   value="${u.age }" /> 
		<br/>
		邮箱<input  name="user.email"   value="${u.email }" /> 
		<br/>
		日期<input  name="user.birthday"   value="${u.birthday}" /> 
		<br/>
		<input  type="submit"  value="修改">
	</form>  
</body>
</html>