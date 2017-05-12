package com.helloworld.hwblog.blog.dao.impl;

import com.helloworld.hwblog.blog.dao.ArticleTypeDao;
import com.helloworld.hwblog.blog.entity.ArticleType;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Created by xdzy on 17-5-12.
 */
@Repository
public class ArticleTypeDaoImpl implements ArticleTypeDao {
    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addArticleType(ArticleType articleType) {
        sessionFactory.getCurrentSession().save(articleType);
    }

    @Override
    public ArticleType getArticleType(int id) {
        return sessionFactory.getCurrentSession().get(ArticleType.class,id);
    }

    @Override
    public ArticleType getArticleType(String name) {
        String hql="from ArticleType as at where at.type=:name";
        Query<ArticleType> query=sessionFactory.getCurrentSession().createQuery(hql,ArticleType.class);
        query.setParameter("name",name);
        return query.uniqueResult();
    }

    @Override
    public void updateArticleType(ArticleType articleType) {
        ArticleType type=sessionFactory.getCurrentSession().get(ArticleType.class,articleType.getId());
        type.setType(articleType.getType());
        sessionFactory.getCurrentSession().update(type);
    }

    @Override
    public void deleteArticleType(int id) {
        ArticleType type=sessionFactory.getCurrentSession().get(ArticleType.class,id);
        sessionFactory.getCurrentSession().delete(type);
    }

    @Override
    public List<ArticleType> getArticleTypes() {
        String hql="from ArticleType";
        Query<ArticleType> query=sessionFactory.getCurrentSession().createQuery(hql,ArticleType.class);
        return query.list();
    }
}
