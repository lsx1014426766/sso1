<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/struts-tags" prefix="s"%>
<!-- 引入dojo的标签库  -->
<%@taglib uri="/struts-dojo-tags" prefix="sx"%>
<html>
<head>
<script type="text/javascript" 
		src="<%=request.getContextPath() %>/ckeditor/ckeditor.js"></script>
<!--引入日期的所需要的js和css -->
<sx:head parseContent="true"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
.nobr br{display: none;}
</style>
</head>
<body>

<h2>房屋信息</h2>
<s:form action="add" method="post" theme="simple">
	房屋标题：<s:textfield id="title" name="title" ></s:textfield>
	<br>
	密码：<s:password  name="pwd"  showPassword="true"></s:password>
	<br>
	房屋类型：
		<s:select 
		value="key"
		name="houseType" 
		list="types" 
		listKey="typeId" 
		listValue="type"/>
		<br><br>
	房屋地址：
	<label class="nobr">
	<s:doubleselect name="district" 
					list="map.keySet()" 
					listKey="districtId" 
					listValue="districtName"
					doubleName="street"
					doubleList="map.get(top)" 
					doubleListKey="streetId" 
					doubleListValue="streetName"/>
	</label>
	<br/>
	是否结婚：
	 <s:checkbox  value="married"  name="married" ></s:checkbox> 
	<br/>
	兴趣：
	<s:checkboxlist list="interest"  
					listKey="id"  
					listValue="name"  
					value="its"
					name="interest"></s:checkboxlist>	
	<br/>
	<!-- ognl表达式  临时定义一个Map集合 -->
	<s:radio list='#{"M":"男","F":"女"}' name="sex"  value="sex"></s:radio>
	<br/>
	<!-- ognl表达式  临时定义一个List集合 -->
	<s:select list="{'北京','上海','广州'}"></s:select>
	<br><br>
	发布时间：<sx:datetimepicker name="timer" label="" type="date"  displayFormat="yyyy-MM-dd"/><br/><br/>
	备注：<s:textarea value="请添加备注信息......"   name="remark"  cssClass="ckeditor"   cols="5"  rows="5"></s:textarea><br/><br/>
	<textarea id="newscontent" 
			  name="newscontent" 
			  class="ckeditor" 
			  rows="8"></textarea>
	<s:submit value="发布信息"></s:submit>
</s:form>
</body>
</html>