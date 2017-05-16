package com.superxu.action;

import com.opensymphony.xwork2.ActionSupport;

public class HelloworldAction extends ActionSupport {

	//默认default访问
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("HelloworldAction");
		return SUCCESS;
	}


}
