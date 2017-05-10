package com.helloworld.hwblog.common.model;

import java.util.Date;

/**
 * Created by xdzy on 17-5-10.
 */
public class TestModel {
    private String name;
    private Date date;

    public TestModel() {
    }

    public TestModel(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
