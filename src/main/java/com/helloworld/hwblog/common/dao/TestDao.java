package com.helloworld.hwblog.common.dao;

import com.helloworld.hwblog.common.entity.TestEntity;

/**
 * Created by xdzy on 2017/5/3.
 */
public interface TestDao {
    public void add(TestEntity test);
    public TestEntity get(int id);
}
