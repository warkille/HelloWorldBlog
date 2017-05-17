package com.helloworld.hwblog.blog.dao.impl;

import com.helloworld.hwblog.blog.dao.ArticleDao;
import com.helloworld.hwblog.blog.entity.Article;
import org.hibernate.query.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by xdzy on 17-5-12.
 */
@Repository
public class ArticleDaoImpl implements ArticleDao {
    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addArticle(Article article) {
        sessionFactory.getCurrentSession().save(article);
    }

    @Override
    public Article getArticle(int id) {
        return sessionFactory.getCurrentSession().get(Article.class,id);
    }

    @Override
    public void updateArticle(Article article) {

    }

    @Override
    public void deleteArticle(int id) {

    }

    @Override
    public List<Article> getArticleList(int first, int count) {
        String hql="from Article order by id desc";
        Query<Article> query=sessionFactory.getCurrentSession().createQuery(hql,Article.class);
        query.setFirstResult(first);
        query.setMaxResults(count);
        return query.list();
    }

    @Override
    public List<Article> getArticleListByType(int first, int count, String type) {
        String hql="from Article as a where a.type like :t order by id desc";
        Query<Article> query=sessionFactory.getCurrentSession().createQuery(hql,Article.class);
        query.setParameter("t",type+"%");
        query.setFirstResult(first);
        query.setMaxResults(count);
        return query.list();
    }
}
