package com.zrgk.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;
public class User1  implements Serializable{
	private int id;
	private String name;
	private int age;
	private String[] interest;
	private List<String> list;
	private Map<String,Object>  map;
	
	public User1() {
	}

	
	public User1(int id, String name, int age, String[] interest,
			List<String> list, Map<String, Object> map) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.interest = interest;
		this.list = list;
		this.map = map;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String[] getInterest() {
		return interest;
	}

	public void setInterest(String[] interest) {
		this.interest = interest;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}
	

}
