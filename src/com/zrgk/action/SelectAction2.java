package com.zrgk.action;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;
import com.zrgk.entity.Temp;
import com.zrgk.entity.Temp2;

public class SelectAction2  extends ActionSupport{
	private int key;
	private List<Temp> market;
	private List<Temp>types;
	private Integer[] k2;
	private String sex;
	private List<Temp2>electronic;
	private List<Temp2>phones;
	private List<Temp2>goods;
	private Map<Temp,List<Temp2>>map;
	public String select(){
    	types=new ArrayList<Temp>();
    	types.add(new Temp(1,"一室一厅"));
    	types.add(new Temp(2,"两室一厅"));
    	types.add(new Temp(3,"两室两厅"));
    	key=2;
    	market=new ArrayList<Temp>();
    	market.add(new Temp(1,"家用电器"));
    	market.add(new Temp(2,"手机数码"));
    	market.add(new Temp(3,"日用百货"));
    	k2=new Integer[]{1,2};
    	sex="W";
    	electronic=new ArrayList<Temp2>();
    	phones=new ArrayList<Temp2>();
    	goods=new ArrayList<Temp2>();
    	map=new HashMap<Temp,List<Temp2>>();
    	electronic.add(new Temp2(1,"电视",market.get(0)));
    	electronic.add(new Temp2(2,"冰箱",market.get(0)));
    	electronic.add(new Temp2(3,"洗衣机",market.get(0)));
    	phones.add(new Temp2(1,"小米手机",market.get(1)));
    	phones.add(new Temp2(2,"照相机",market.get(1)));
    	phones.add(new Temp2(3,"笔记本",market.get(1)));
    	goods.add(new Temp2(1,"沙发",market.get(2)));
    	goods.add(new Temp2(2,"床垫",market.get(2)));
    	goods.add(new Temp2(3,"背包",market.get(2)));
    	map.put(market.get(0),electronic);
    	map.put(market.get(1),phones);
    	map.put(market.get(2),goods);
    	return "success";
    }
	
	
	public List<Temp2> getElectronic() {
		return electronic;
	}


	public void setElectronic(List<Temp2> electronic) {
		this.electronic = electronic;
	}


	public List<Temp2> getPhones() {
		return phones;
	}


	public void setPhones(List<Temp2> phones) {
		this.phones = phones;
	}


	public List<Temp2> getGoods() {
		return goods;
	}


	public void setGoods(List<Temp2> goods) {
		this.goods = goods;
	}


	public Map<Temp, List<Temp2>> getMap() {
		return map;
	}


	public void setMap(Map<Temp, List<Temp2>> map) {
		this.map = map;
	}


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	public Integer[] getK2() {
		return k2;
	}


	public void setK2(Integer[] k2) {
		this.k2 = k2;
	}


	public List<Temp> getTypes() {
		return types;
	}
	public void setTypes(List<Temp> types) {
		this.types = types;
	}

	public List<Temp> getMarket() {
		return market;
	}

	public void setMarket(List<Temp> market) {
		this.market = market;
	}

	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}


	
}
