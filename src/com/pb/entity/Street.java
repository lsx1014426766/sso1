package com.pb.entity;

//街道信息
public class Street {
	private District district;  //街道所处地区
	private int streetId;  //街道ID
	private String streetName; //街道名称
	
	public Street() {
	}


	public Street( int streetId, String streetName,District district) {
		this.streetId = streetId;
		this.streetName = streetName;
		this.district = district;
	}


	public District getDistrict() {
		return district;
	}


	public void setDistrict(District district) {
		this.district = district;
	}


	public int getStreetId() {
		return streetId;
	}

	public String getStreetName() {
		return streetName;
	}
	public void setStreetId(int streetId) {
		this.streetId = streetId;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
}
