package com.zrgk.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class SomeAction  extends ActionSupport{
	@Override
	public String execute() throws Exception {
		// 通过ActionContext获取session对象
		Map<String, Object> session = 
			ActionContext.getContext().getSession();
		session.put("name","张三丰");
		
		Map<String, Object> application = ActionContext.getContext().getApplication();
		application.put("interest", "吃喝玩乐");
		
		Map <String,Object> request =(Map <String,Object>)ActionContext.getContext().get("request");
		request.put("pwd", "jiushipassword");
		return "success";
	}

	

}
