package com.zrgk.action;

import com.opensymphony.xwork2.ActionSupport;
import com.zrgk.dao.IUserDao;
import com.zrgk.dao.impl.UserDaoJDBCImpl;
import com.zrgk.entity.User;


public class LoadAction  extends ActionSupport{
	private int id;
	private User u ;
	
	@Override
	public String execute() throws Exception {
		IUserDao dao = new UserDaoJDBCImpl();
		u = dao.findUserById(id);
		return SUCCESS;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public User getU() {
		return u;
	}


	public void setU(User u) {
		this.u = u;
	}

}
