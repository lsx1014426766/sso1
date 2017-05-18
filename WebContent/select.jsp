<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib uri="/struts-tags" prefix="s"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
  </head>
  <body> 
  <!-- 下拉列表 -->
  <s:select name="types" value="key" list="types" listKey="id" listValue="name"></s:select>
  <s:select list="{'星星','月亮','太阳'}"></s:select><br/>
  <!-- 复选框 -->
  <s:checkboxlist list="market" 
  name="market" value="k2"
  listValue="name" listKey="id" 
  ></s:checkboxlist> <br/>
  <!-- 单选框 -->
  <s:radio list='#{"M":"男","W":"女" }' value="sex" name="sex" ></s:radio><br/>
  <!-- 双级联  省市级联-->
  <s:form name="test">

<s:doubleselect label="请选择所在省市"

   name="province" list="{'四川省','山东省'}" doubleName="city"

   doubleList="top == '四川省' ? {'成都市', '绵阳市'} : {'济南市', '青岛市'}" /><br/>
   
   
    <s:doubleselect name="map" list="map.keySet()"  listKey="id" listValue="name" 
  doubleName=""   doubleList="map.get(top)" doubleListKey="id" doubleListValue="name" 
  ></s:doubleselect><br/>

</s:form>
  
 
  
  
  
  
  </body>
</html>
