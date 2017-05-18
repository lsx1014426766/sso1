package com.tarena.action;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.util.ServletContextAware;

public class BaseAction implements RequestAware,
ServletRequestAware,SessionAware,
ApplicationAware,ServletContextAware{
	protected Map<String,Object> request;
	protected HttpServletRequest httpRequest;
	protected Map<String,Object> session;
	protected Map<String,Object> application;
	//在Action创建时自动执行
	public void setRequest(Map<String, Object> req) {
		this.request = req;
	}

	public void setServletRequest(HttpServletRequest req) {
		httpRequest = req;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public void setApplication(Map<String, Object> application) {
		this.application = application;
	}

	public void setServletContext(ServletContext arg0) {
		// TODO Auto-generated method stub
		
	}
}
