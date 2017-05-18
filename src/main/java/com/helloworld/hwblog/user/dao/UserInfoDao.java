package com.helloworld.hwblog.user.dao;


import com.helloworld.hwblog.user.entity.UserInfo;

public interface UserInfoDao {
	  void addInUser(UserInfo user);
	   void deleteInUser(UserInfo user);
	   UserInfo getInUser(String username);
	   void updateInUser(UserInfo userEntity);
  

}
