package com.helloworld.hwblog.blog.entity;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by xdzy on 17-5-12.
 */
@Entity
public class Article {
    @Id
    @GeneratedValue(generator = "aid")
    @GenericGenerator(name = "aid",strategy = "native")
    private int id;
    @Column
    private String title;
    private String type;
    private String tags;
    private String publisher;
    private int original;
    @Column(columnDefinition = "TEXT")
    private String content;
    @Column
    private Date date;
    private int readCount;

    public Article() {
    }

    public Article(String title, String type, String tags, String publisher, int original, String content,int readCount) {
        this.title = title;
        this.type = type;
        this.tags = tags;
        this.publisher = publisher;
        this.original = original;
        this.content = content;
        this.readCount = readCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", type=" + type +
                ", tags='" + tags + '\'' +
                ", publisher='" + publisher + '\'' +
                ", original=" + original +
                ", context='" + content + '\'' +
                ", date=" + date +
                ", readCount=" + readCount +
                '}';
    }
}
