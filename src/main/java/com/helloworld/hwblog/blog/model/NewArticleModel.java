package com.helloworld.hwblog.blog.model;

import java.util.Date;

/**
 * Created by xdzy on 17-5-13.
 */
public class NewArticleModel {
    private String title;
    private int type;
    private String tags;
    private String publisher;
    private int original;
    private String content;

    public NewArticleModel() {
    }

    public NewArticleModel(String title, int type, String tags, String publisher, int original, String content) {
        this.title = title;
        this.type = type;
        this.tags = tags;
        this.publisher = publisher;
        this.original = original;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getOriginal() {
        return original;
    }

    public void setOriginal(int original) {
        this.original = original;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean validate(){
        if(title==null||content==null) return false;
        if(title.length()>20||title.length()<4) return false;
        return true;
    }
}
