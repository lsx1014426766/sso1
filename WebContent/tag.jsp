<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib   uri="/struts-tags" prefix="s"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<style type="text/css">
.s1{
	background-color: red;
}


.s2{
	background-color: yellow;
}	




</style>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!--获取action类中属性的值    -->
	<s:property value="name" />
	<s:property value="name.toUpperCase()" />
	<br/>
	<s:property value="pwd" />
	<s:property value="\"就是\"+pwd" />
	<br/>
	<s:property value="birthday" />
	<br/>
	<!-- 获取并且显示日期类型的属性 -->
	<s:date name="birthday"  format="yyyy/MM/dd"/>
	<br/>
	<!-- 获取context区域中值 -->
	<s:property  value="#session.projectDesc"/>
	<br/>
	<s:property  value="#application.workDesc"/>
	<br/>
	<s:property  value="#request.desc"/>
	
	<br/>
	<s:property  value="add.city"/>
	<!--  将某个值绑定到对应范围上 -->
	<s:set   name="str" value="add.city" scope="session">
	</s:set>
	<br/>
	<s:property value="#session.str"/>
	<!-- jsp页面使用struts2的标签时，方便调试 -->
	<br/>
	<!-- 判断标签 -->
	<s:if test="age lt  13">
		<span>你是小孩</span>
	</s:if>
	<s:elseif test="age lt 30">
		<span>你是青年人</span>
	</s:elseif>
	<s:elseif  test="age < 60">
		<span>你是中年人</span>
	</s:elseif>
	<s:else>
		<span>你是老年人</span>
	</s:else>
	
	<!--  从root区域查找 -->
	<table border="1px"  width="50%">
		<caption>迭代显示</caption>
		<tr>
			<th>序号</th>
			<th>行号</th>
			<th>编号</th>
			<th>名字</th>
			<th>密码</th>
			<th>日期</th>
			<th>年龄</th>
			<th>邮箱</th>
		</tr>
	<!-- 循环迭代 -->
	<!-- 迭代的时候,struts2会将正在迭代的对象作为root对象，访问root对象中的属性值，直接使用属性名即可 -->
	<s:iterator value="users"  status="sta">
		<s:if test="#sta.even">
			<tr class="s1">
		</s:if>
		<s:else>
			<tr class="s2">
		</s:else>
			<td><s:property  value="#sta.index"/></td>
			<td><s:property  value="#sta.count"/></td>
			<td><s:property  value="id"/></td>
			<td><s:property  value="name"/></td>
			<td><s:property  value="pwd"/></td>
			<td><s:date name="birthday" format="yyyy年MM月dd日"/>  </td>
			<td><s:property  value="age"/></td>
			<td><s:property  value="email"/></td>
		</tr>
	</s:iterator>
	</table>
	
	<!-- 从context区域查找 -->
	<table border="1px"  width="50%">
		<caption>迭代显示</caption>
		<tr>
			<th>编号</th>
			<th>名字</th>
			<th>密码</th>
			<th>日期</th>
			<th>年龄</th>
			<th>邮箱</th>
		</tr>
	<!-- 循环迭代 -->
	<s:iterator value="users"  var="u" >
		<tr>
			<td><s:property  value="#u.id"/>,${u.id}</td>
			<td><s:property  value="#u.name"/>,${u.name }</td>
			<td><s:property  value="#u.pwd"/>,${u.pwd }</td>
			<td><s:date name="#u.birthday" format="yyyy年MM月dd日"/>,${u.birthday} </td>
			<td><s:property  value="#u.age"/>,${u.age }</td>
			<td><s:property  value="#u.email"/>,${u.email}</td>
		</tr>
	</s:iterator>
	<!-- 从session中取出users集合 -->
	<s:iterator value="#session.users"  var="u">
		<tr>
			<td><s:property  value="#u.id"/></td>
			<td><s:property  value="#u.name"/></td>
			<td><s:property  value="#u.pwd"/></td>
			<td><s:date name="#u.birthday" format="yyyy年MM月dd日"/>  </td>
			<td><s:property  value="#u.age"/></td>
			<td><s:property  value="#u.email"/></td>
		</tr>
	</s:iterator>
	</table>
	<s:debug/>
</body>
</html>