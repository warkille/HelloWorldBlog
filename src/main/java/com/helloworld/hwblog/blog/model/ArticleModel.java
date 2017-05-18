package com.helloworld.hwblog.blog.model;

import java.util.Date;

/**
 * Created by xdzy on 17-5-13.
 */
public class ArticleModel {
    private String title;
    private String type;
    private String tags;
    private String publisher;
    private int original;
    private String content;
    private Date date;
    private int readCount;

    public ArticleModel() {
    }

    public ArticleModel(String title, String type, String tags, String publisher, int original, String content, Date date, int readCount) {
        this.title = title;
        this.type = type;
        this.tags = tags;
        this.publisher = publisher;
        this.original = original;
        this.content = content;
        this.date = date;
        this.readCount = readCount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
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

    public String getOriginal() {
        if(original==1) return "原创";
        else return "转载";
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getReadCount() {
        return readCount;
    }

    public void setReadCount(int readCount) {
        this.readCount = readCount;
    }

    public String[] getTagsArray(){
        return tags.split(";");
    }
}
