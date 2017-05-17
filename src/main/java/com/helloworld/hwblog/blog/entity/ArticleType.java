package com.helloworld.hwblog.blog.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by xdzy on 17-5-12.
 */
@Entity
public class ArticleType {
    @Id
    @GeneratedValue(generator = "atid")
    @GenericGenerator(name = "atid",strategy = "native")
    private int id;
    private String type;

    public ArticleType() {
    }

    public ArticleType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
