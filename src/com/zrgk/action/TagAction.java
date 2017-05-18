package com.zrgk.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.zrgk.entity.Address;
import com.zrgk.entity.User;

public class TagAction extends ActionSupport{
	private String name;
	private String pwd;
	private Date birthday;
	private Address add;
	private int age;
	private List<User> users;
	@Override
	public String execute() throws Exception {
		name = "zhangsan";
		pwd ="123456";
		age = 92;
		birthday=new Date();
		add = new Address();
		add.setCity("北京");
		add.setStreet("上地十街");
		Map<String, Object> session = ActionContext.getContext().getSession();
		session.put("projectDesc", "一直被模仿，从来没被超越！！");
		Map<String, Object> app = ActionContext.getContext().getApplication();
		app.put("workDesc","学软件不易，搞java更难，且学且珍惜！！！");
		
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("desc", "我是好人");
		users = new ArrayList<User>();
		User u = new User();
		u.setAge(22);
		u.setBirthday(new Date());
		u.setEmail("zzz@163.com");
		u.setId(111);
		u.setName("zsssss");
		u.setPwd("111111");
		User u2 = new User();
		u2.setAge(32);
		u2.setBirthday(new Date());
		u2.setEmail("lisi@163.com");
		u2.setId(2222);
		u2.setName("lisii");
		u2.setPwd("22222");
		users.add(u);
		users.add(u2);
		session.put("users", users);
		return "success";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
	
}
