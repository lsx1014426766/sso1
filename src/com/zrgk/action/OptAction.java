package com.zrgk.action;

import com.opensymphony.xwork2.ActionSupport;

public class OptAction  extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	
	public String opt1(){
		if(name.equals("") || name==null){
			return "error";
		}
		return "success";
	}
	
	public String opt2(){
//		if(name.equals("") || name==null){
//			return "error";
//		}
		// 模拟出现一个运行时异常,也会定位到错误页面
		String s = null;
		s.length();
		return "success";
	}
	public String add(){
		System.out.println("添加用户。。。。。");
		return "success";
	}
	
	public String delete(){
		System.out.println("删除用户。。。。。");
		return "success";
	}
	
	public String update(){
		System.out.println("修改用户。。。。。");
		return "success";
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
