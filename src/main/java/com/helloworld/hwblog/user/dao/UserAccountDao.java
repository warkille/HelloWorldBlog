package com.helloworld.hwblog.user.dao;

import com.helloworld.hwblog.user.entity.UserAccount;

public interface UserAccountDao {
	    void addAcUser(UserAccount user);
	    void deleteAcUser(UserAccount user);
	    UserAccount getAcUser(String username,String password);
	    void updateAcUser(UserAccount userEntity);
    
}
