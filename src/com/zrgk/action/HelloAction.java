package com.zrgk.action;

public class HelloAction {
	private String name;
	public String sayHello(){
		System.out.println("execute......");
		System.out.println("name="+name);
		return "success";
	}

	public String getName() {
		System.out.println("getName.....");
		return name;
	}

	public void setName(String name) {
		System.out.println("setName......");
		this.name = name;
	}
}
