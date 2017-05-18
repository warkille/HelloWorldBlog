package com.helloworld.hwblog.user.controller;

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
		return "success";
	else
	{
	return "error";
	}
 }
   public String toLogin(){
	   return "tolpage";
   }
}
