package com.zrgk.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class SearchAction extends ActionSupport {
	private String input;
	private List<String> keywords;
	
	public String getKeyword(){
		//获取关键词，在真实项目中，关键词一般是从数据库或项目缓存中查询得到
		String[] words = {"北京市","北京大学","北大方正","北大科技","北大资源","中软高科","中国人民","aaaa","abcd","aaaa","bbbbb"};
		keywords = new ArrayList<String>();
		for(String s : words){
			if(s.indexOf(input) != -1){
				keywords.add(s);
			}
		}
		return SUCCESS;
	}

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public List<String> getKeywords() {
		return keywords;
	}

	public void setKeywords(List<String> keywords) {
		this.keywords = keywords;
	}
}
