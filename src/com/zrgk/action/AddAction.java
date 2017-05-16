package com.zrgk.action;


import com.opensymphony.xwork2.ActionSupport;
import com.zrgk.dao.IUserDao;
import com.zrgk.dao.impl.UserDaoJDBCImpl;
import com.zrgk.entity.User;

public class AddAction extends ActionSupport{
	// input属性
	private User u;
	
	public String add() throws Exception{
		IUserDao dao = new UserDaoJDBCImpl();
		boolean flag = dao.addUser(u);
		if(flag){
			return "success";
		}
		return "error";
	}

	public User getU() {
		return u;
	}

	public void setU(User u) {
		this.u = u;
	}
	
}
