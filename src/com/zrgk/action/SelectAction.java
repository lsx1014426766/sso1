package com.zrgk.action;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;
import com.zrgk.entity.Temp;

public class SelectAction  extends ActionSupport{
	private int key;
	private List<Temp> market;
	private List<Temp>types;
	private Integer[] k2;
	private String sex;
	private List<Temp>electronic;
	private List<Temp>phones;
	private List<Temp>goods;
	private Map<Temp,List<Temp>>map;
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
    	electronic=new ArrayList<Temp>();
    	phones=new ArrayList<Temp>();
    	goods=new ArrayList<Temp>();
    	map=new HashMap<Temp,List<Temp>>();
    	electronic.add(new Temp(1,"电视"));
    	electronic.add(new Temp(2,"冰箱"));
    	electronic.add(new Temp(3,"洗衣机"));
    	phones.add(new Temp(1,"小米手机"));
    	phones.add(new Temp(2,"照相机"));
    	phones.add(new Temp(3,"笔记本"));
    	goods.add(new Temp(1,"沙发"));
    	goods.add(new Temp(2,"床垫"));
    	goods.add(new Temp(3,"背包"));
    	map.put(market.get(0),electronic);
    	map.put(market.get(1),phones);
    	map.put(market.get(2),goods);
    	return "success";
    }
	
	
	public List<Temp> getElectronic() {
		return electronic;
	}


	public void setElectronic(List<Temp> electronic) {
		this.electronic = electronic;
	}


	public List<Temp> getPhones() {
		return phones;
	}


	public void setPhones(List<Temp> phones) {
		this.phones = phones;
	}


	public List<Temp> getGoods() {
		return goods;
	}


	public void setGoods(List<Temp> goods) {
		this.goods = goods;
	}


	public Map<Temp, List<Temp>> getMap() {
		return map;
	}


	public void setMap(Map<Temp, List<Temp>> map) {
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
