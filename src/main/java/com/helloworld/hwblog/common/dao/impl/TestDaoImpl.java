package com.helloworld.hwblog.common.dao.impl;

import com.helloworld.hwblog.common.dao.TestDao;
import com.helloworld.hwblog.common.entity.TestEntity;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by xdzy on 2017/5/3.
 */
@Repository
public class TestDaoImpl implements TestDao {
    private SessionFactory sessionFactory;
    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void add(TestEntity test) {
        sessionFactory.getCurrentSession().save(test);
    }
    public TestEntity get(int id) {
        return sessionFactory.getCurrentSession().get(TestEntity.class,id);
    }
  
}
