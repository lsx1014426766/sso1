package com.zrgk.action;

public class DemoAction  extends BaseAction{
	@Override
	public String execute() throws Exception {
		session.put("aa", "啊啊啊啊");
		application.put("bb", "花花");
		return "success";

	}
}
