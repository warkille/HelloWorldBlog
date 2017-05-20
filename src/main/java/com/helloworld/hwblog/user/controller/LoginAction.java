package com.helloworld.hwblog.user.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.helloworld.hwblog.user.model.LoginModel;
import com.helloworld.hwblog.user.service.UserService;
import com.opensymphony.xwork2.ModelDriven;
@Controller
public class LoginAction implements ModelDriven<LoginModel> {
	@Autowired
	private UserService usersevice;
	public void setUsersevice(UserService usersevice) {
		this.usersevice = usersevice;
     }
    LoginModel logmodel=new LoginModel();
	@Override
	public LoginModel getModel() {
		// TODO Auto-generated method stub
		return logmodel;
	}
   public String login(){
	
	if(usersevice.login(logmodel))
	{
		 HttpServletRequest request= ServletActionContext.getRequest();
		 request.getSession().setAttribute("loginUser", logmodel);
		return "success";
	}
		
	else
	{
	return "error";
	}
 }
   public String toLoginPage(){
	   return "tolpage";
   }
}
