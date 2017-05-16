package com.zrgk.action;

import com.opensymphony.xwork2.ActionSupport;
import com.zrgk.dao.IUserDao;
import com.zrgk.dao.impl.UserDaoJDBCImpl;
import com.zrgk.entity.User;

public class UpdateAction extends ActionSupport{
	private User user;
	@Override
	public String execute() throws Exception {
		IUserDao dao = new UserDaoJDBCImpl();
		boolean flag = dao.updateUser(user);
		if(flag){
			return "success";
		}
		return "error";
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
