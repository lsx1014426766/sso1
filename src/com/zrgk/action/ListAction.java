package com.zrgk.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.zrgk.dao.IUserDao;
import com.zrgk.dao.impl.UserDaoJDBCImpl;
import com.zrgk.entity.User;

public class ListAction extends ActionSupport{
	// output
	private List<User>  users;
	public String list() throws Exception{
		IUserDao dao = new UserDaoJDBCImpl();
		users = dao.findAll();
		return "list";
	}

	public List<User> getUsers() {
		return users;
	}


	public void setUsers(List<User> users) {
		this.users = users;
	}
}
