<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登录</title>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<base href="<%=basePath%>">
</head>
<body>

	<center>
		<h1>请登录</h1>
		<form  action="<%=basePath %>sso/dologin.action" method="post">
			<span>用户名：</span>
				<input type="text" name="username"/>
			<span>密码：</span>
				<input type="password" name="password">
			<input type="text" name="gotourl" value="${gotourl}"/>
			<input type="submit" />
		</form>
	</center>
</body>
</html>