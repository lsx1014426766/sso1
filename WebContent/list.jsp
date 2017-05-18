<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <!-- Can not find the tag library descriptor for "http://java.sun.com/jsp/jstl/core"
    去maven仓库下载jstl.jar,standard.jar
     -->
 <%@ taglib  prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>  
 <%@ taglib prefix="s"  uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1px"  width="60%">
		<tr>
			<th>姓名</th>
			<th>密码</th>
			<th>年龄</th>
			<th>邮箱</th>
			<th>日期</th>
			<th>操作</th>
		</tr>
		
	<c:forEach  items="${users}"  var="u">
		<tr>
			<td>${u.name}</td>
			<td>${u.pwd }</td>
			<td>${u.age }</td>
			<td>${u.email }</td>
			<td>${u.birthday }</td>
			<td><a href="delete.action?id=${u.id}">删除用户</a>&nbsp;<a  href="load.action?id=${u.id}">修改用户</a></td>
		</tr>
	</c:forEach>
		
	</table>
<a href="user/toAdd.action">添加用户</a>




</body>
</html>