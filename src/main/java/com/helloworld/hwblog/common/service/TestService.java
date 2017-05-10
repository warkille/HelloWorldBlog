package com.helloworld.hwblog.common.service;

import com.helloworld.hwblog.common.model.TestModel;

/**
 * Created by xdzy on 17-5-10.
 */

public interface TestService {
    void addTestModel(TestModel testModel);
    TestModel getTestModel(int id);
}
