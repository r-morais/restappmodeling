package com.benpot.struts.action;

import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import com.benpot.model.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	/******************************
	 * ATTRIBUTES
	 ******************************/
	protected HttpServletResponse servletResponse;

	protected HttpServletRequest servletRequest;

	private static final long serialVersionUID = 1L;

	private User user;

	private String remember;

	
	/******************************
	 * METHODS
	 ******************************/	
	public LoginAction() {
		servletRequest = ServletActionContext.getRequest();
		servletResponse = ServletActionContext.getResponse();
	}
	

	@Override
	public String input() throws Exception {
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

		if (user == null)
			return super.input();
		else
			return LOGIN;

	}

	@Override
	public String execute() throws Exception {

		if (user.getLogin().equals("admin")) {
			Map<String, Object> session = ActionContext.getContext().getSession();
			session.put("loggedUser", user);

			// Create cookie
			if (remember != null && remember.equals("on")) {
				Cookie div = new Cookie("user", user.getLogin());
				div.setMaxAge(60 * 60 * 24 * 30);
				servletResponse.addCookie(div);
			}

			return SUCCESS;
		} else {
			return ERROR;
		}
	}

	public String remove() throws Exception {
		Map<String, Object> session = ActionContext.getContext().getSession();
		session.remove("loggedUser");

		Cookie div = new Cookie("user", "");
		div.setMaxAge(0);
		servletResponse.addCookie(div);
		
		addActionMessage("logged out");

		return SUCCESS;
	}

	/******************************
	 * GETTER AND SETTERS
	 ******************************/
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getRemember() {
		return remember;
	}

	public void setRemember(String remember) {
		this.remember = remember;
	}

}
