package com.zrgk.action;

import com.opensymphony.xwork2.ActionSupport;
/**
 * 这里给出了3种Action实现方式 LoginAction LoginAction2 LoginAction3
 * @author lsx
 *
 */
public class LoginAction extends ActionSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//根据登录用户不同 去不同的页面
	private String nextPage;
	private String name;
	private String pwd;
	
	//xml里面不指定方法名时走的分支方法
	@Override
	public String execute() throws Exception {
		System.out.println( "LoginAction.....");
		if("admin".equals(name)){
			nextPage = "adminPage.jsp";
			System.out.println( "adminPage.jsp");
		}else if("common".equals(name)){
			nextPage = "commonPage.jsp";
			System.out.println( "commonPage.jsp");
		}else{
			nextPage = "login.jsp";
			System.out.println( "login..jsp");
		}
		return "success";

	}

	public String login() throws Exception {
		if("admin".equals(name) && "1234".equals(pwd)){
			return   SUCCESS;
		}else{
			return ERROR;
		}
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNextPage() {
		return nextPage;
	}

	public void setNextPage(String nextPage) {
		this.nextPage = nextPage;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	
}
