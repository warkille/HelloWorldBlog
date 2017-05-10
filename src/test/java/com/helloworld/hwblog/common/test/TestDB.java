package com.helloworld.hwblog.common.test;

import com.helloworld.hwblog.common.dao.TestDao;
import com.helloworld.hwblog.common.entity.TestEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * Created by xdzy on 2017/5/3.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ActiveProfiles("dev")
@ContextConfiguration("classpath:spring/rootconfig.xml")
public class TestDB {
    @Autowired
    private TestDao testDao;
    @Test
    public void test1(){
        testDao.add(new TestEntity("123",null));
    }
}
