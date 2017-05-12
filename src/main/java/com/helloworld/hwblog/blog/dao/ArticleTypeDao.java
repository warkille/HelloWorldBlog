package com.helloworld.hwblog.blog.dao;

import com.helloworld.hwblog.blog.entity.ArticleType;

import java.util.List;

/**
 * Created by xdzy on 17-5-12.
 */
public interface ArticleTypeDao {
    void addArticleType(ArticleType articleType);
    ArticleType getArticleType(int id);
    ArticleType getArticleType(String name);
    void updateArticleType(ArticleType articleType);
    void deleteArticleType(int id);
    List<ArticleType> getArticleTypes();
}
