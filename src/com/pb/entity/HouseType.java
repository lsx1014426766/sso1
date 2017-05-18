package com.pb.entity;

//房型信息
public class HouseType {
	private int typeId;// 房屋类型编号
	private String type;// 房屋类型名称
	public HouseType() {
	}
	public HouseType(int typeId, String type) {
		super();
		this.typeId = typeId;
		this.type = type;
	}
	public int getTypeId() {
		return typeId;
	}
	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
