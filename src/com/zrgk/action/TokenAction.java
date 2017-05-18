package com.zrgk.action;

import com.opensymphony.xwork2.ActionSupport;

public class TokenAction extends ActionSupport{
	private String name;
	private String pwd;
	
	@Override
	public String execute() throws Exception {
		System.out.println("调用了Action业务方法！");
		System.out.println(name);
		return "success";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	
	
	
}
