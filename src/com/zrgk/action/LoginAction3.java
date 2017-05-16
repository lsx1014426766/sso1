package com.zrgk.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.zrgk.entity.User;

public class LoginAction3 extends ActionSupport 
			implements ModelDriven{
	// 需要实例化
	private User u = new User();
	@Override
	public String execute() throws Exception {
		System.out.println(u);//注意此时的u并不为null,直接走这个action
		System.out.println("用户名："+u.getName());
		return "success";
	}
	
	public Object getModel() {
		return u;
	}
	
}
