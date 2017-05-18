package com.zrgk.action;

import java.util.Map;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class SomeAction3 extends ActionSupport 
					implements SessionAware,ApplicationAware {
	private  Map<String, Object> session;
	private Map<String, Object> application;
	
	public String execute() throws Exception {
		session.put("aaaaa", "啊啊啊啊啊");

		return "success";
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public void setApplication(Map<String, Object> application) {
		this.application = application;
	}

}
