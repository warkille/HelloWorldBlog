package com.helloworld.hwblog.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.helloworld.hwblog.user.model.RegisteoneModel;
import com.helloworld.hwblog.user.service.UserService;
import com.opensymphony.xwork2.ModelDriven;
@Controller
public class RegistoneAction implements ModelDriven<RegisteoneModel>{
	@Autowired
	private UserService usersevice;
	public void setUsersevice(UserService usersevice) {
		this.usersevice = usersevice;
	}
	
	RegisteoneModel reisgtone=new RegisteoneModel();
	public void setReisgtone(RegisteoneModel reisgtone) {
		this.reisgtone = reisgtone;
	}
	public RegisteoneModel getReisgtone() {
		return reisgtone;
	}
	@Override
	public RegisteoneModel getModel() {
		// TODO Auto-generated method stub
	
		return reisgtone;
	}

	public String registeone(){
		System.out.println(reisgtone);
		System.out.println(getModel());
		usersevice.regist(getModel());
		return "success";
	}
	
	public String toPage(){
		
		return "topage";
	}
}
