package com.pb.web.action;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.opensymphony.xwork2.ActionSupport;
import com.pb.entity.District;
import com.pb.entity.House;
import com.pb.entity.HouseType;
import com.pb.entity.Street;

public class AddAction extends ActionSupport{
	private String title;
	private String houseType;
	private String district;
	private String street;
	private String timer;
	private String remark;
	private boolean married;
	private String interest;
	private String sex;
	
	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	@Override
	public String execute() throws Exception {
		System.out.println(title);
		System.out.println(married);
		System.out.println(interest);
		System.out.println(houseType);	
		System.out.println(district);
		System.out.println(street);
		System.out.println(timer);
		System.out.println(remark);
		System.out.println(sex);
		return SUCCESS;
	}
	

	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getHouseType() {
		return houseType;
	}



	public void setHouseType(String houseType) {
		this.houseType = houseType;
	}



	public String getDistrict() {
		return district;
	}



	public void setDistrict(String district) {
		this.district = district;
	}



	public String getStreet() {
		return street;
	}



	public void setStreet(String street) {
		this.street = street;
	}



	public String getTimer() {
		return timer;
	}



	public void setTimer(String timer) {
		this.timer = timer;
	}



	public String getRemark() {
		return remark;
	}



	public void setRemark(String remark) {
		this.remark = remark;
	}


	public boolean isMarried() {
		return married;
	}


	public void setMarried(boolean married) {
		this.married = married;
	}


	public String getInterest() {
		return interest;
	}


	public void setInterest(String interest) {
		this.interest = interest;
	}


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}
	
}
