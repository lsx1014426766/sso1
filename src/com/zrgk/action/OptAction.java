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
		// ģ�����һ������ʱ�쳣,Ҳ�ᶨλ������ҳ��
		String s = null;
		s.length();
		return "success";
	}
	public String add(){
		System.out.println("����û�����������");
		return "success";
	}
	
	public String delete(){
		System.out.println("ɾ���û�����������");
		return "success";
	}
	
	public String update(){
		System.out.println("�޸��û�����������");
		return "success";
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
