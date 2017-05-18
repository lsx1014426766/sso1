package com.pb.web.action;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import com.opensymphony.xwork2.ActionSupport;
import com.pb.entity.District;
import com.pb.entity.HouseType;
import com.pb.entity.Street;

public class HouseAction extends ActionSupport{
	private String title;
	private String pwd;
	private List<HouseType> types; //房屋类型
	private Map<District,List<Street>> map; //地区-街道 级联集合
	private int key;//默认传递的房屋的类型id
	private boolean married;
	private List<Option>  interest;
	private Integer [] its;
	private String sex;
	private int address;
	
	
	public int getAddress() {
		return address;
	}

	public void setAddress(int address) {
		this.address = address;
	}

	public Map<District, List<Street>> getMap() {
		return map;
	}

	public void setMap(Map<District, List<Street>> map) {
		this.map = map;
	}
	
	public List<HouseType> getTypes() {
		return types;
	}

	public void setTypes(List<HouseType> types) {
		this.types = types;
	}

	public String addHouse(){
		address=2;
		title="惜缘小区";
		pwd ="11111";
		married=true;
		sex = "M";
		interest = new ArrayList<Option>();
		Option o1 = new Option(1,"吃");
		Option o2 = new Option(2,"喝");
		Option o3 = new Option(3,"玩");
		interest.add(o1);
		interest.add(o2);
		interest.add(o3);
		its = new Integer[]{1,2};
		//房型信息集合
		types=new ArrayList<HouseType>();
		//HouseType：typeId,type
		types.add(new HouseType(1,"一室一厅"));
		types.add(new HouseType(2,"两室一厅"));
		types.add(new HouseType(3,"两室两厅"));
		key =2;
		
		
		//创建两个城区信息
		District district1=new District(1,"朝阳区");
		District district2=new District(2,"东城区");
		
		//创建三条街道信息
		List<Street> streets1=new ArrayList<Street>();
		List<Street> streets2=new ArrayList<Street>();
		Street street1=new Street(1,"朝阳一街",district1);
		Street street2=new Street(2,"东城一街",district2);
		Street street3=new Street(3,"东城二街",district2);
		
		//创建相应街道集合，一个地区的街道为一个集合
		streets1.add(street1);  //第一个地区的街道信息
		streets2.add(street2); //第二个地区的街道信息
		streets2.add(street3);//第二个地区的街道信息
		
		map=new HashMap<District,List<Street>>();
		map.put(district1, streets1);
		map.put(district2, streets2);
		
		
		return SUCCESS;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Integer getKey() {
		return key;
	}

	public void setKey(Integer key) {
		this.key = key;
	}

	public boolean isMarried() {
		return married;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}
	public List<Option> getInterest() {
		return interest;
	}

	public void setInterest(List<Option> interest) {
		this.interest = interest;
	}

	public Integer[] getIts() {
		return its;
	}

	public void setIts(Integer[] its) {
		this.its = its;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
}
