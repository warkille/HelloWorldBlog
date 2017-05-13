package com.helloworld.hwblog.user.service;

import com.helloworld.hwblog.user.model.LoginModel;
import com.helloworld.hwblog.user.model.RegisteoneModel;
import com.helloworld.hwblog.user.model.RegistetwoModel;

public interface UserService {
	//用户注册
	public boolean regist(RegisteoneModel resgite);
	//注册2
	public boolean regist2(RegistetwoModel resgite);
	
	//用户登录
	public  boolean login(LoginModel login);


}
