package com.pb.entity;
/**
 * 用户类
 * @author bdqn
 */
public class User {
	
	private String username;	//用户名
	private String password;	//密码
	private Integer age;		//年龄
	private String email;		//邮箱
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}