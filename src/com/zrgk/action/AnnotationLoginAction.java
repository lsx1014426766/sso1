/*package com.zrgk.action;

import com.opensymphony.xwork2.ActionSupport;

import org.apache.struts2.convention.annotation.Action;   

import org.apache.struts2.convention.annotation.ExceptionMapping;   
 
import org.apache.struts2.convention.annotation.ExceptionMappings;   
 
import org.apache.struts2.convention.annotation.Namespace;   
 
import org.apache.struts2.convention.annotation.ParentPackage;   
 
import org.apache.struts2.convention.annotation.Result;   
 
import org.apache.struts2.convention.annotation.Results;   
 
*//** 
 * Struts2基于注解的Action配置
 * @author lsx
 *
 *//*
 
@ParentPackage("struts-default") 
 
@Namespace("/annotation_test") 
 
@Results( { @Result(name = "success", location = "/main.jsp"), 
 
        @Result(name = "error", location = "/error.jsp") }) 
 
@ExceptionMappings( { @ExceptionMapping(exception = "java.lange.RuntimeException", result = "error") }) 
 
public class AnnotationLoginAction extends ActionSupport { 
 
    private static final long serialVersionUID = 2730268055700929183L;  
 
    private String name;   
 
    private String pwd;   
 
   
 
    @Action("annlogin") //或者写成  @Action(value = "login")  
 
    public String login() throws Exception {   
        if ("admin".equals(name) && "1234".equals(pwd)) {   
        	System.out.println("annlogin success!");
            return SUCCESS;   
 
        } else {   
        	System.out.println("annlogin ERROR!");
            return ERROR;   
 
        }   
 
    }   
 
    @Action(value = "add", results = { @Result(name = "success", location = "/index.jsp") })   
 
    public String add() throws Exception {   
    	System.out.println("AnnotationLoginAction add!");
        return SUCCESS;   
 
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
 
  
 
} 
*/