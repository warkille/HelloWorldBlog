package com.helloworld.hwblog.blog.model;

/**
 * Created by xdzy on 17-5-12.
 */
public class ArticleTypeModel {
    private int typeNumber;
    private String type;
    private String typeName;

    public ArticleTypeModel() {
    }

    public ArticleTypeModel(int typeNumber,String type, String typeName) {
        this.type=type;
        this.typeNumber = typeNumber;
        this.typeName = typeName;
    }

    public int getTypeNumber() {
        return typeNumber;
    }

    public void setTypeNumber(int typeNumber) {
        this.typeNumber = typeNumber;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getUrl(){
        return "./blog/articles.action?type="+type+"&index=1";
    }
}
