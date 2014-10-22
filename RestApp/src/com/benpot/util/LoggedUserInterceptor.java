package com.benpot.util;

import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.benpot.model.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class LoggedUserInterceptor implements Interceptor{

	protected HttpServletRequest servletRequest;
	
	@Override
	public void destroy() {		
	}

	@Override
	public void init() {
		
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {

		servletRequest = ServletActionContext.getRequest();
		
		Map<String, Object> session = ActionContext.getContext().getSession();
		User user = (User) session.get("loggedUser");

		//read cookie
		if(user == null) {
			for (Cookie c : servletRequest.getCookies()) {
				if (c.getName().equals("user")) {
					if(c.getValue() != null) {
						user = new User();
						user.setLogin(c.getValue());
					}
				}
			}
		}
		
		if (user == null) {
			System.out.println("usuário desconectado");
			
			return "relogin";
		} else {
			System.out.println("CustomInterceptor, before invocation.invoke()...");
			 
			String result = invocation.invoke();
	 
			System.out.println("CustomInterceptor, after invocation.invoke()...");
	 
			return result;	
			
		}		
				
	}

}
