package com.zrgk.action;

import com.opensymphony.xwork2.ActionSupport;
import com.zrgk.entity.User;

public class LoginAction2 extends ActionSupport {
	// input 属性
	private  User user;//先走jsp页面，然后传递user进来
	@Override
	public String execute() throws Exception {
		String pwd = user.getPwd();//获取属性值
		String name = user.getName();
		System.out.println("密码="+pwd);
		System.out.println("用户名="+name);
		if("admin".equals(name) &&"1234".equals(pwd)){
			return "success";
		}else{
			return "login";
		}
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
