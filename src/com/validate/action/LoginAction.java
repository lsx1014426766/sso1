package com.validate.action;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private String username;
	private String password;

	// validate方法对所有业务方法进行验证
//	@Override
//	public void validate() {
//		
//	}

	// 该方法对login业务方法进行验证  该方法通过会执行业务方法(login)
	// 该方法验证不通过，不会执行业务方法(login)
	//注意这里的写法是固定的validateXXX XXX代表方法名，在执行方法之前先会走这个对应的验证方法
	/**
	 * 注意此方法返回的void,在controller xml中对应的是 result name=input 
	 * 此方法需要做的就是，发现有验证错误，就添加错误信息
	 */
	public void validateLogin() {
		if (username == null || username.equals("")) {
			this.addFieldError("username", "用户名不能为空!!!");
		}
		if (password == null || password.equals("")) {
			this.addFieldError("password", "密码不能为空!!!");
		}
	}

	public String login() {
		if (username.equals("scott") && password.equals("1234")) {
			return "success";
		} else {
			//action级别的错误
			this.addActionError("用户名或者密码错误！！！");
		}
		return "input";//主动告知返回验证失败对应的页面
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
