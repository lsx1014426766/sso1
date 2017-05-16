package com.zrgk.action;

import com.opensymphony.xwork2.ActionSupport;
import com.zrgk.dao.IUserDao;
import com.zrgk.dao.impl.UserDaoJDBCImpl;

public class DeleteAction extends ActionSupport {
	private int id;
	
	@Override
	public String execute() throws Exception {
		IUserDao dao = new UserDaoJDBCImpl();
		System.out.println("id="+id);
		boolean flag = dao.deleteUserById(id);
		if(flag){
			return "success";
		}
		return "error";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
