package com.helloworld.hwblog.common.service.impl;

import com.helloworld.hwblog.common.dao.TestDao;
import com.helloworld.hwblog.common.entity.TestEntity;
import com.helloworld.hwblog.common.model.TestModel;
import com.helloworld.hwblog.common.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xdzy on 17-5-10.
 */
@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestDao testDao;

    public void setTestDao(TestDao testDao) {
        this.testDao = testDao;
    }

    @Override
    public void addTestModel(TestModel testModel) {
        TestEntity testEntity=new TestEntity(testModel.getName(),testModel.getDate());
        testDao.add(testEntity);
    }

    @Override
    public TestModel getTestModel(int id) {
        TestEntity testEntity=testDao.get(id);
        return new TestModel(testEntity.getName(),testEntity.getDate());
    }
}
