<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
2种写法<br/>
    1使用普通a标签：
	<a  href="down/doDownloadFile.action">下载文件</a><br/>
	2使用struts提供的a标签，不同在于struts会自动加后缀，不要画蛇添足
	<s:a action="down/doDownloadFile">下载文件</s:a>
</body>
</html>