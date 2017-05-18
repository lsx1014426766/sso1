package com.tarena.action;

public class CheckCodeAction extends BaseAction{
	//input
	private String code;//用户输入
	//output
	private boolean ok = false;//false:错,true:对
	
	public String execute(){
		System.out.println(code);
		//获取session存储的code
		String scode = (String)session.get("code");
		//与用户输入比较
		if(code.equals(scode)){
			ok = true;
		}else{
			ok = false;
		}
		//调用json result将ok响应输出
		return "success";
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public boolean isOk() {
		return ok;
	}

	public void setOk(boolean ok) {
		this.ok = ok;
	}
}
