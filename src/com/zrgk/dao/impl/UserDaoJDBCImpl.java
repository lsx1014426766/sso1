package com.zrgk.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.zrgk.dao.IUserDao;
import com.zrgk.entity.User;
import com.zrgk.util.ConnUtils;

public class UserDaoJDBCImpl implements IUserDao{
	public boolean addUser(User u) throws Exception {
		Connection conn = ConnUtils.getConnection();
		try{
			/*String sql
			="insert into user_myc(id,name,pwd,age,email,birthday)" +
					"values(seq_myc.nextval,?,?,?,?,?)";*/
			String sql
			="insert into user_myc(name,pwd,age,email,birthday)" +
					"values(?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,u.getName());
			ps.setString(2, u.getPwd());
			ps.setInt(3,u.getAge());
			ps.setString(4,u.getEmail());
			if(u.getBirthday()!=null){
				ps.setDate(5,new java.sql.Date(u.getBirthday().getTime()));
			}else{
				ps.setDate(5,Date.valueOf("1991-01-06"));
			}
			
			int n = ps.executeUpdate();
			if(n==1){
				return true;
			}
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}finally{
			if(conn != null)
				conn.close();
		}
		return false;
	}

	
	public boolean deleteUserById(int id) throws Exception {
		Connection conn = ConnUtils.getConnection();
		try{
			String sql ="delete from user_myc where id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1,id);
			int n = ps.executeUpdate();
			if(n==1){
				return true;
			}
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}finally{
			if(conn != null)
				conn.close();
		}
		return false;
	}

	public List<User> findAll() throws Exception {
		Connection conn = ConnUtils.getConnection();
		List<User> users = null;
		try{
			String sql ="select * from user_myc";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			users = new ArrayList<User>();
			while(rs.next()){
				User u = new User(rs.getInt("id"),rs.getString("name"),rs.getString("pwd"),rs.getString("email"),rs.getInt("age"),rs.getDate("birthday"));
				users.add(u);
			}
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}finally{
			if(conn != null)
				conn.close();
		}
		return users;
	}

	public User findUserById(int id) throws Exception {
		Connection conn = ConnUtils.getConnection();
		User u = null;
		try{
			String sql ="select * from user_myc where id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1,id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				u = new User(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString("email"),rs.getInt("age"),rs.getDate("birthday"));
			}
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}finally{
			if(conn != null)
				conn.close();
		}
		return u;
	}

	public boolean updateUser(User u) throws Exception {
		Connection conn = ConnUtils.getConnection();
		try{
			String sql ="update user_myc set name=?,email=?,age=?,pwd=?,birthday=? where id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,u.getName());
			ps.setString(2, u.getEmail());
			ps.setInt(3,u.getAge());
			ps.setString(4,u.getPwd());
			ps.setInt(6,u.getId());
			ps.setDate(5, new java.sql.Date(u.getBirthday().getTime()));
			int n = ps.executeUpdate();
			if(n==1){
				return true;
			}
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}finally{
			if(conn != null)
				conn.close();
		}
		return false;
	}

}
