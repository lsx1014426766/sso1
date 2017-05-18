package com.zrgk.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class UploadAction extends ActionSupport {
	private File upload;
	private String uploadFileName;
	private String uploadContentType;
    
	public String doUpload() throws IOException{
		System.out.println(upload);
		System.out.println(uploadContentType);
		System.out.println(uploadFileName);
		
		String savePath = ServletActionContext.getServletContext().getRealPath("/upload/"+this.uploadFileName);
		System.out.println(savePath);
		FileInputStream fis = new FileInputStream(upload);
		FileOutputStream fos = new FileOutputStream(savePath);
		IOUtils.copy(fis, fos);
		fos.flush();
		fos.close();
		fis.close();
		return SUCCESS;
	}

	public File getUpload() {
		return upload;
	}

	public void setUpload(File upload) {
		this.upload = upload;
	}

	public String getUploadFileName() {
		return uploadFileName;
	}

	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}

	public String getUploadContentType() {
		return uploadContentType;
	}

	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}
}
