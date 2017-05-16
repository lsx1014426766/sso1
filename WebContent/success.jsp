<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 引入struts2的标签库 -->
<%@ taglib   prefix="s"  uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
gotourl=${gotourl}<br/>
    success!!!!
     欢迎${name}登录！！！
    欢迎<s:property  value="name"/>登录！！！<br/>
    
     success!!!!
    欢迎${user.username}登录！！！
    欢迎 <s:property   value="user.name"/>  登录！！！<br/>
    
     success!!!!
    欢迎${user.name}登录！！！
    欢迎 <s:property   value="user.pwd"/>  登录！！！
  

</body>
</html>