package com.zrgk.action;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class DownloadAction extends ActionSupport {
	private String fileName;
	private InputStream is;

	public String getFileName() throws UnsupportedEncodingException {
		// 编码的目的是为了解决中文文件名下载时出现乱码的问题
		return java.net.URLEncoder.encode(fileName, "UTF-8");// 该编码方式在IE6下可能有该问题：文件名长度不能超过16个字符
		// return new String(this.fileName.getBytes("GBK"),"ISO-8859-1");//该编码方式可兼容IE6，但GBK不利于实现国际化

	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	/*
	 * 把读取文件的流对象返回，Web服务器会读取流对象中的数据并封装到response中，然后发送到客户端
	 */
	// public InputStream getInputStream() throws FileNotFoundException,
	// UnsupportedEncodingException{
	// return null;
	// }
	public String doDownloadFile() throws Exception {
		// 此处可加入业务，如判断用户是否有下载权限
		this.fileName = "图片.jpeg";
		// 把URL路径转化为服务器的本地路径
		ServletContext application = ServletActionContext.getServletContext();
		String realPath = application.getRealPath("/download/" + this.fileName);
		System.out.println(realPath);
		// 將要下載的文件转换为流
		is = new FileInputStream(realPath);
		return SUCCESS;
	}

	public InputStream getIs() {
		return is;
	}

	public void setIs(InputStream is) {
		this.is = is;
	}
}
