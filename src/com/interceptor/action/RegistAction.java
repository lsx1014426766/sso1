package com.interceptor.action;

import com.opensymphony.xwork2.ActionSupport;

public class RegistAction extends ActionSupport {
	private String name;
	@Override
	public String execute() throws Exception {
		System.out.println("name="+name);
		// 模拟处理慢点
		Thread.sleep(12);
		return "success";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
