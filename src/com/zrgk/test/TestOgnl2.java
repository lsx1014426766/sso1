package com.zrgk.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.zrgk.entity.User1;
import ognl.Ognl;

public class TestOgnl2 {
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
		//u.setMap(map);
		Map<String,Object> context = new HashMap<String,Object>();
		context.put("name","张三");
		// ognl表达式中没有# 去root对象中查找对应属性的值
		// Ognl表达式中有#  去context区 查找  
		System.out.println(Ognl.getValue("name", context,u));//zsf
		System.out.println(Ognl.getValue("#name", context,u));//张三
		System.out.println(Ognl.getValue("name+#name", context,u));//张三
	}

}
