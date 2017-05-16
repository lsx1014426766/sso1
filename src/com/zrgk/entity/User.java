package com.zrgk.entity;

import java.io.Serializable;
import java.util.Date;
public class User  implements Serializable{
	
	private int id;
	private String name;
	private String pwd;
	private String email;
	private int age;
	private Date birthday;
	
	public User() {
	}


	
	
	public User(int id, String name, String pwd, String email, int age,
			Date birthday) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
		this.email = email;
		this.age = age;
		this.birthday = birthday;
	}
	



	public User(String name, String pwd, String email, int age, Date birthday) {
		super();
		this.name = name;
		this.pwd = pwd;
		this.email = email;
		this.age = age;
		this.birthday = birthday;
	}




	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}




	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	
	
}
