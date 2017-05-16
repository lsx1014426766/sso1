package com.zrgk.action;

import com.opensymphony.xwork2.ActionSupport;

public class RegistAction extends ActionSupport {
	private String name;
	private String pwd;
	private String birthday;
	private String email;
	@Override
	public String execute() throws Exception {
		if(name==null|| "".equals(name) || "".equals(pwd)||pwd==null){
			return "regist";
		}
		if(name.equals("admin")){
			return "regist";
		}
		return "ok";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
