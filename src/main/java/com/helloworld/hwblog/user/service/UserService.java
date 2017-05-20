package com.helloworld.hwblog.user.service;

import com.helloworld.hwblog.user.model.LoginModel;
import com.helloworld.hwblog.user.model.RegisteoneModel;
import com.helloworld.hwblog.user.model.RegistetwoModel;

public interface UserService {
	//�û�ע��
	public boolean regist(RegisteoneModel resgite);
	//ע��2
	public boolean regist2(RegistetwoModel resgite);
	
	//�û���¼
	public  boolean login(LoginModel login);


}
