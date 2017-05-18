package com.helloworld.hwblog.user.dao.impl;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.helloworld.hwblog.user.dao.UserAccountDao;
import com.helloworld.hwblog.user.entity.UserAccount;
import com.helloworld.hwblog.user.entity.UserInfo;
@Repository
public class UserAccountDaoImpl implements UserAccountDao {
	private SessionFactory sessionFactory;
	 @Autowired
	    public void setSessionFactory(SessionFactory sessionFactory) {
	        this.sessionFactory = sessionFactory;
	    }
	@Override
	public void addAcUser(UserAccount user) {
		// TODO Auto-generated method stub
		 sessionFactory.getCurrentSession().save(user);
	}

	@Override
	public void deleteAcUser(UserAccount user) {
		// TODO Auto-generated method stub
		 sessionFactory.getCurrentSession().delete(user);
		
	}

	@Override
	public UserAccount getAcUser(String username, String password) {
		  String hql="from UserAccount as u where u.username=:uname and u.password=:upass";
	        Query query=sessionFactory.getCurrentSession().createQuery(hql);
	        query.setString("uname",username);
	        query.setString("upass",password);
	        UserAccount useraccount= ( UserAccount) query.uniqueResult();
	        return useraccount;
	}

	@Override
	public void updateAcUser(UserAccount userEntity) {
		// TODO Auto-generated method stub
		 sessionFactory.getCurrentSession().update(userEntity);
		
	}

}
