package com.pb.entity;

import java.util.Date;

//房屋信息
public class House {
	private Date addDate; //房屋发布时间
	private int houseId;//房屋ID
	private Street street;//房屋所处街道
	private String title; //房屋标题
	
	
	public House() {
	}
	public House(int houseId, Street street, String title, Date addDate) {
		this.houseId = houseId;
		this.street = street;
		this.title = title;
		this.addDate = addDate;
	}
	public Date getAddDate() {
		return addDate;
	}
	
	public int getHouseId() {
		return houseId;
	}
	public Street getStreet() {
		return street;
	}
	public String getTitle() {
		return title;
	}
	public void setAddDate(Date addDate) {
		this.addDate = addDate;
	}
	public void setHouseId(int houseId) {
		this.houseId = houseId;
	}
	public void setStreet(Street street) {
		this.street = street;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
}
