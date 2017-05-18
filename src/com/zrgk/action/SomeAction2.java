package com.zrgk.action;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class SomeAction2 extends ActionSupport {
	@Override
	public String execute() throws Exception {
		//通过ServletActionContext获取的是原始的request对象
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("username", "乔峰");
		
		
		HttpSession session = request.getSession();
		session.setAttribute("password", "1111111");
		
		ServletContext application = ServletActionContext.getServletContext();
		application.setAttribute("address", "中关村");
		
		return "success";
	}

	

}
