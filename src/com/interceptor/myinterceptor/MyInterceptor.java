package com.interceptor.myinterceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

// 自定义拦截器
public class MyInterceptor extends AbstractInterceptor{
	@Override
	public String intercept(ActionInvocation   ai) throws Exception {
		// 拦截器拦截的代码
		long start = System.currentTimeMillis();
		// 调用后续的拦截器或者Action  先入后出
		String result = ai.invoke(); 
		long end = System.currentTimeMillis();
		long time = end -start;
		System.out.println("时间："+time);
		return result;
	}
}
