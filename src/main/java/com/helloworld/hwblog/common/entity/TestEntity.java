package com.helloworld.hwblog.common.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by xdzy on 2017/5/3.
 */
@Entity(name = "testTable")
public class TestEntity {
    @Id
    @GeneratedValue(generator = "pid")
    @GenericGenerator(name = "pid",strategy = "native")
    private int id;
    private String name;
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    public TestEntity() {
    }

    public TestEntity(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
