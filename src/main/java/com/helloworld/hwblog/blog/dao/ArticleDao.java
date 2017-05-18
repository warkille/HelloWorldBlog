package com.helloworld.hwblog.blog.dao;

import com.helloworld.hwblog.blog.entity.Article;

import java.util.List;

/**
 * Created by xdzy on 17-5-12.
 */
public interface ArticleDao {
    void addArticle(Article article);
    Article getArticle(int id);
    void updateArticle(Article article);
    void deleteArticle(int id);
    List<Article> getArticleList(int first,int count);
    List<Article> getArticleListByType(int first,int count,int type);
    int getDataCount();
    int getDataCount(int type);
    void addReadCount(int id);
}
