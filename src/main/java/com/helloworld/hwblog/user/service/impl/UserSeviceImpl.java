package com.helloworld.hwblog.user.service.impl;

import java.util.Date;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.helloworld.hwblog.user.dao.UserAccountDao;
import com.helloworld.hwblog.user.dao.UserInfoDao;
import com.helloworld.hwblog.user.entity.UserAccount;
import com.helloworld.hwblog.user.entity.UserInfo;
import com.helloworld.hwblog.user.model.LoginModel;
import com.helloworld.hwblog.user.model.RegisteoneModel;
import com.helloworld.hwblog.user.model.RegistetwoModel;
import com.helloworld.hwblog.user.service.UserService;
@Service
public class UserSeviceImpl implements UserService {
	 @Autowired
	 private UserAccountDao useraccoundao;
	 @Autowired
	 private UserInfoDao userinfodao;

	public void setUseraccoundao(UserAccountDao useraccoundao) {
		this.useraccoundao = useraccoundao;
	}

	public void setUserinfodao(UserInfoDao userinfodao) {
		this.userinfodao = userinfodao;
	}

	@Override
	public boolean regist(RegisteoneModel resgite) {
		// TODO Auto-generated method stub
		//判断重复密码是否相同
		if(!resgite.getPassword().equals(resgite.getRepassword())) return false;
		//是否同名
		if(useraccoundao.getAcUser(resgite.getUsername(),resgite.getPassword())!=null) return false;
		
		// 1 �ж���֤���Ƿ���ȷ
				// ��ÿͻ�����֤��
				// ���session��֤��
				/*String checkcode_session = (String) request.getSession().getAttribute(
						"checkcode_session");
				request.getSession().removeAttribute("checkcode_session");
				if (resgite.getCheckcode() == null || !resgite.getCheckcode().equals(checkcode_session)) {
					// ��֤�����
					request.setAttribute("msg", "��֤���������");
					return false;
				} */
				else {
					
					UserAccount useraccount=new UserAccount();
					useraccount.setUsername(resgite.getUsername());
					useraccount.setPassword(resgite.getPassword());
					useraccount.setEmail(resgite.getEmail());		
					useraccoundao.addAcUser(useraccount);
					//
					UserInfo userinfo=new UserInfo( resgite.getUsername(), "icon_phtot", 1,
							new Date(), "location blog", null, "basketball",
							resgite.getUsername(),0);
					  userinfodao.addInUser(userinfo);
		            
		              userinfo= userinfodao.getInUser(resgite.getUsername());
		           
		              ServletActionContext.getRequest().setAttribute("reginfo", userinfo);
		               return true;
					}
		
		
		
	}

	@Override
	public boolean regist2(RegistetwoModel resgite) {
		// TODO Auto-generated method stub
		userinfodao.updateInUser(new UserInfo(resgite.getNickName(),resgite.getIcon(),resgite.getSex(),
				resgite.getBirthday(),resgite.getAddress(),resgite.getQqAcount(),
				resgite.getHobby()));
		return true;
	}

	@Override
	public boolean login(LoginModel login) {
		 // 传递用户名 和密码 到DAO
		//return userdao.getUser(login.getUsername(),login.getPassword());
		 UserAccount user=useraccoundao.getAcUser(login.getUsername(),login.getPassword());
		 ServletActionContext.getRequest().setAttribute("userac", user);
	        if(user==null) 
	        	{
	        	return false;
	        	}
	        	
	        else{
	        return true;
	        }
	}

}
