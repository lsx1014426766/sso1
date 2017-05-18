package com.tarena.action;

import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.util.Map;

public class ImageAction extends BaseAction{
	//该属性由stream组件负责输出
	private InputStream imageStream;
	
	public String execute(){
		//生成一个验证码图片
		Map<String,BufferedImage> map = 
					ImageUtil.createImage();
		//获取图片字符
		String code = map.keySet().iterator().next();
		session.put("code", code);//保存图片字符,为以后校验使用
		BufferedImage image = map.get(code);//获取图片对象
		//将图片给imageStream属性
		try {
			imageStream = ImageUtil.change(image);
			return "success";//调用stream类型的result响应
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
	}

	public InputStream getImageStream() {
		return imageStream;
	}

	public void setImageStream(InputStream imageStream) {
		this.imageStream = imageStream;
	}
	
}
