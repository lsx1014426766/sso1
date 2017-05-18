package com.interceptor.action;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	@Override
	public String execute() throws Exception {
		// 模拟处理慢点
		Thread.sleep(10);
		System.out.println("com.interceptor.action.LoginAction");
		return "success";
	}

}
