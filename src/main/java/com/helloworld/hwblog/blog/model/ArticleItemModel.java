package com.helloworld.hwblog.blog.model;

import java.util.Date;

/**
 * Created by xdzy on 17-5-13.
 */
public class ArticleItemModel {
    private int aId;
    private String title;
    private String detail;
    private String tags;
    private Date date;
    private int readCount;
    private String publisher;
    private String pubnisherIcon;

    public ArticleItemModel() {
    }

    public ArticleItemModel(int aId, String title, String detail, String tags, Date date, int readCount, String pubnisher, String pubnisherIcon) {
        this.aId = aId;
        this.title = title;
        this.detail = detail;
        this.tags = tags;
        this.date = date;
        this.readCount = readCount;
        this.publisher = pubnisher;
        this.pubnisherIcon = pubnisherIcon;
    }

    public int getaId() {
        return aId;
    }

    public void setaId(int aId) {
        this.aId = aId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
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

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String pubnisher) {
        this.publisher = pubnisher;
    }

    public String getPubnisherIcon() {
        return pubnisherIcon;
    }

    public void setPubnisherIcon(String pubnisherIcon) {
        this.pubnisherIcon = pubnisherIcon;
    }

    public String[] getTagsArray(){
        return tags.split(";");
    }

    public String getUserIconUrl(){
        return "./resources/user/icon/"+pubnisherIcon;
    }

    public String getArticleLink(){
        return "./blog/article_"+aId;
    }
}
