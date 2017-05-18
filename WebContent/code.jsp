<%@ page language="java"  pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <script type="text/javascript" 
  	src="js/jquery-1.4.3.js"></script>
  <script type="text/javascript">
  	$(function(){
  		//单击"看不清楚"按钮切换验证码
  		$("#change").click(function(){
  			//重新指定img的src属性
  			$("#code").attr("src","imagecode.action?dt="+new Date().getTime());
  			return false;//阻止<a>元素的href动作
  		});
  		//单击图片切换验证码
  		$("#change1").click(function(){
  			$("#change").click();
  		});
  	});
  	//检查验证码
  	$(function(){
  		$("#code_text").blur(function(){
  			//焦点离开开始发送ajax请求检查
  			var code = $("#code_text").val();
  			if(code == ""){
  				$("#code_span").html("验证码不能为空!");
  				return;
  			}
  			$.post(
  			   "checkcode.action",
  			   {"code":code},
  			   function(data){//data是服务器返回的ok值
  			     //成功处理后执行
  			     if(data == true){
  			     	$("#code_span").html("验证码正确!");
  			     }else{
  			     	$("#code_span").html("验证码错误!");
  			     }
  			   },"json"
  			);
  		});
  	});
  	
  </script>
  </head>
  
  <body>
    <a id="change1"><img id="code" src="imagecode.action"/></a>
    <a id="change" href="#">看不清楚?</a><br/>
    <input type="text" name="code_text" id="code_text">
    <span id="code_span"></span>
  </body>
</html>
