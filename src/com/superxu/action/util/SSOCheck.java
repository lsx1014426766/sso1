package com.superxu.action.util;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

public class SSOCheck {
    private static final String USERNAME="admin";
    private static final String PASSWORD="123";
	public static boolean checklogin(String username,String password){
		if(USERNAME.equals(username)&& PASSWORD.equals(password)){
			return true;
		}
		return false;
	}
	
	public static boolean checkcookie(HttpServletRequest request){
		Cookie[] cookies = request.getCookies();
		if(cookies!=null){
			for(Cookie cookie:cookies){
				if(cookie.getName().equals("ssocookie")&& cookie.getValue().equals("sso")){
					return true;
				}
			}
		}
		return false;
	}
}
