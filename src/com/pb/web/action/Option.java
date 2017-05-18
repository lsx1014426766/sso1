package com.pb.web.action;

import java.io.Serializable;

public class Option implements Serializable{
	private int id;
	private String name;
	public Option() {
	}
	
	
	public Option(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
}
