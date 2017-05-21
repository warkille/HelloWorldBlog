package com.helloworld.hwblog.user.dao.impl;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.helloworld.hwblog.blog.entity.ArticleType;
import com.helloworld.hwblog.user.dao.UserInfoDao;
import com.helloworld.hwblog.user.entity.UserInfo;
@Repository
public class UserInfoDaoImpl implements UserInfoDao {
	private SessionFactory sessionFactory;
	 @Autowired
	    public void setSessionFactory(SessionFactory sessionFactory) {
	        this.sessionFactory = sessionFactory;
	    }

	@Override
	public void addInUser(UserInfo user) {
		// TODO Auto-generated method stub
		 sessionFactory.getCurrentSession().save(user);
	}

	@Override
	public void deleteInUser(UserInfo user) {
		// TODO Auto-generated method stub
		 sessionFactory.getCurrentSession().delete(user);
	}

	@Override
	public UserInfo getInUser(String username ) {
		// TODO Auto-generated method stub
		 String hql="from UserInfo as u where u.username=:uname";
	        Query query=sessionFactory.getCurrentSession().createQuery(hql);
	        query.setString("uname",username);
	        UserInfo userinfo= ( UserInfo) query.uniqueResult();
	        return userinfo;
		
	}

	@Override
	public void updateInUser(UserInfo userEntity) {
		// TODO Auto-generated method stub0
		//从数据库里面查询出来
		UserInfoDaoImpl users=new UserInfoDaoImpl();
		UserInfo userinfo=users.getInUser(userEntity.getUsername());
		//更改内容
		userinfo.setAddress(userEntity.getAddress());
		 sessionFactory.getCurrentSession().update(userinfo);
		
	}



}
