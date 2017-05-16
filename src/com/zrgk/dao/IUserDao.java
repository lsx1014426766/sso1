package com.zrgk.dao;

import java.util.List;

import com.zrgk.entity.User;
//封装了对数据库的增删改查操作
public interface IUserDao {
	// 查询表中所有的数据
		public List<User> findAll()throws Exception;
		// 查询对应id的那个用户对象
		public User findUserById(int id)throws Exception;
		//添加用户对象
		public boolean addUser(User u)throws Exception;
		// 删除用户对象
		public boolean deleteUserById(int id) throws Exception; 
		//修改用户对象
		public boolean updateUser(User u) throws Exception;
}
