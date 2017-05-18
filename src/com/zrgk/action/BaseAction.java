package com.zrgk.action;

import java.util.Map;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class BaseAction  extends ActionSupport implements SessionAware,ApplicationAware{
	protected Map<String, Object> session;
	protected Map<String, Object> application;
	
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	public void setApplication(Map<String, Object> application) {
		this.application=application;
	}
}
