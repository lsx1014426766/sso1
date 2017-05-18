package com.pb.web.action;

import com.opensymphony.xwork2.ActionSupport;
import com.pb.entity.User;

public class UserAction extends ActionSupport {

	private User user;

	public String register() {
		// 完成注册的业务...  先走验证xml，验证成功则进入此方法
		System.out.println("完成注册的业务...");
		// addActionError("用户名或密码错误！"); //添加Action错误		
		return SUCCESS;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}