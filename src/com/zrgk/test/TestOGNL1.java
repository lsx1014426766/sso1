package com.zrgk.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ognl.Ognl;

import com.zrgk.entity.User1;

// OGNL表达式的使用
public class TestOGNL1 {
	public static void main(String[] args) throws Exception {
		User1 u = new User1();
		u.setName("zsf");
		u.setId(10);
		u.setAge(23);
		u.setInterest(new String[]{"吃饭","睡觉","打代码"});
		List <String> list = new ArrayList<String>();
		list.add("林青霞");
		list.add("林志颖");
		list.add("林心如");
		u.setList(list);
		
		Map<String,Object>  map = new HashMap<String,Object>();
		map.put("aa","huahua");
		map.put("bb", "诗诗");
		u.setMap(map);
		// 获取root对象（User1对象作为root对象）  获取root中属性的值
		Object id = Ognl.getValue("id", u);
		System.out.println(id);
		String name = (String)Ognl.getValue("name",u);
		System.out.println(name);
		// ognl表达式进行计算
		System.out.println(Ognl.getValue("id+10",u));//20
		System.out.println(Ognl.getValue("name.toUpperCase()", u));
		System.out.println(Ognl.getValue("\"我是\"+name+\"，今年28，至今未婚\"", u));
		System.out.println(Ognl.getValue("age>18?'成年人':'未成年人'", u));
		
		// ognl表达式获取数组或者list集合中值
		System.out.println(Ognl.getValue("interest[2]", u));
		System.out.println(Ognl.getValue("list[2]",u));
		System.out.println(Ognl.getValue("list.get(2)",u));
		System.out.println(Ognl.getValue("list.size()", u));
		//ognl表达式调用静态方法
		System.out.println(Ognl.getValue("@java.util.Arrays@toString(interest)", u));
		//ognl表达式获取Map集合中的值
		System.out.println(Ognl.getValue("map.get('bb')", u));
		System.out.println(Ognl.getValue("map.bb", u));
		System.out.println(Ognl.getValue("map['bb']", u));
		System.out.println(Ognl.getValue("map.aa.toUpperCase()", u));
		
		
	}

}
