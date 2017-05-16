package com.zrgk.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import com.zrgk.dao.IUserDao;
import com.zrgk.dao.impl.UserDaoJDBCImpl;
import com.zrgk.entity.User;

public class ConnUtils {
	static Properties prop = new Properties();
	static{
		InputStream in = ConnUtils.class.getClassLoader().getResourceAsStream("sql.properties");
		try {
			prop.load(in);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static  Connection getConnection(){
		String driver = prop.getProperty("driver");
		String url = prop.getProperty("url");
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");
		Connection conn = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,username,password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void main(String[] args) {
		Connection conn = getConnection();
		System.out.println(conn);
		IUserDao dao=new UserDaoJDBCImpl();
		User u=new User();
		u.setName("ddd");
		
		try {
			dao.addUser(u);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
