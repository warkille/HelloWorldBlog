package com.helloworld.hwblog.blog.model;

/**
 * Created by xdzy on 17-5-12.
 */
public class ArticleTypeModel {
    private int typeNumber;
    private String typeName;

    public ArticleTypeModel() {
    }

    public ArticleTypeModel(int typeNumber, String typeName) {
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

    @Override
    public String toString() {
        return "ArticleTypeModel{" +
                "typeNumber=" + typeNumber +
                ", typeName='" + typeName + '\'' +
                '}';
    }
}
