package com.pb.entity;

//地区信息
public class District{
	private int districtId;   //地区ID
	private String districtName; //地区名称
	
	public District() {
	}

	public District(int districtId, String districtName) {
		this.districtId = districtId;
		this.districtName = districtName;
	}

	public int getDistrictId() {
		return districtId;
	}

	public void setDistrictId(int districtId) {
		this.districtId = districtId;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	
}