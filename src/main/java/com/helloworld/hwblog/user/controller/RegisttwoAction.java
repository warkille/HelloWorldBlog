package com.helloworld.hwblog.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.helloworld.hwblog.user.model.RegistetwoModel;
import com.helloworld.hwblog.user.service.UserService;
import com.opensymphony.xwork2.ModelDriven;

@Controller
public class RegisttwoAction implements ModelDriven<RegistetwoModel>
{
@Autowired
private UserService usersevice;
public void setUsersevice(UserService usersevice) {
	this.usersevice = usersevice;
}
RegistetwoModel registe=new RegistetwoModel();
	public RegistetwoModel getRegiste() {
	return registe;
}
public void setRegiste(RegistetwoModel registe) {
	this.registe = registe;
}
	@Override
	public RegistetwoModel getModel() {
		// TODO Auto-generated method stub
		return registe;
	} 
	public String registetwo(){
		
		usersevice.regist2(registe);
		return "success";
	}
}
