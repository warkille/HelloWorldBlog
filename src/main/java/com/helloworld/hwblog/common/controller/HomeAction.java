package com.helloworld.hwblog.common.controller;

import com.helloworld.hwblog.common.dao.TestDao;
import com.helloworld.hwblog.common.entity.TestEntity;
import com.helloworld.hwblog.common.model.TestModel;
import com.helloworld.hwblog.common.service.TestService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by xdzy on 2017/5/3.
 */
@Controller
public class HomeAction extends ActionSupport{
    @Autowired
    private TestService testService;

    public void setTestService(TestService testService) {
        this.testService = testService;
    }

    public String home(){
        TestModel testModel=testService.getTestModel(1);
        ServletActionContext.getRequest().setAttribute("test",testModel);
        return "success";
    }
}
