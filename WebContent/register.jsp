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
	
	<h3>使用UserAction-registerAction-validation.xml进行验证</h3>
	<!-- 注意：这里使用的s标签action值不能加后缀 -->
	<s:form action="registerAction"
			method="post" 
		    namespace="/validate">
		用户名：<s:textfield name="user.username"/>
		<s:if test="fieldErrors['user.username']!=null">
			<s:property value="fieldErrors['user.username'][0]"/>
		</s:if>
		<br/>
		密&nbsp;&nbsp;&nbsp;&nbsp;码：<s:password name="user.password" />
		<s:if test="fieldErrors['user.password']!=null">
			<s:property value="fieldErrors['user.password'][0]"/>
		</s:if>
		<br/>
		年&nbsp;&nbsp;&nbsp;&nbsp;龄：<s:textfield name="user.age" />
		<s:if test="fieldErrors['user.age']!=null">
			<s:property value="fieldErrors['user.age'][0]"/>
		</s:if>
		<br/>
		邮&nbsp;&nbsp;&nbsp;&nbsp;箱：<s:textfield name="user.email" />
		<s:if test="fieldErrors['user.email']!=null">
			<s:property value="fieldErrors['user.email'][0]"/>
		</s:if>
		<br/>
		<s:submit value="提交" />
	</s:form>
	<s:debug/>
</body>
</html>