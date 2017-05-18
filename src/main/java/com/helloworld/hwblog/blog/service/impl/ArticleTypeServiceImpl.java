package com.helloworld.hwblog.blog.service.impl;

import com.helloworld.hwblog.blog.dao.ArticleTypeDao;
import com.helloworld.hwblog.blog.entity.ArticleType;
import com.helloworld.hwblog.blog.model.ArticleTypeModel;
import com.helloworld.hwblog.blog.service.ArticleTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xdzy on 17-5-12.
 */
@Service
public class ArticleTypeServiceImpl implements ArticleTypeService {
    @Autowired
    private ArticleTypeDao articleTypeDao;

    public void setArticleTypeDao(ArticleTypeDao articleTypeDao) {
        this.articleTypeDao = articleTypeDao;
    }

    @Override
    public boolean addArticleType(ArticleTypeModel model) {
        ArticleType articleType=articleTypeDao.getArticleType(model.getTypeName());
        if(articleType!=null) return false;
        articleType=new ArticleType(model.getType(),model.getTypeName());
        articleTypeDao.addArticleType(articleType);
        return true;
    }

    @Override
    public List<ArticleTypeModel> getArticleTypeList() {
        List<ArticleType> list=articleTypeDao.getArticleTypes();
        List<ArticleTypeModel> modelList=new ArrayList<>();
        for(ArticleType a:list){
            modelList.add(new ArticleTypeModel(a.getId(),a.getType(),a.getTypeName()));
        }
        return modelList;
    }

    @Override
    public String getArticleTypeList_JSON() {
        return null;
    }

    @Override
    public boolean deleteArticleType(int typeNumber) {
        return false;
    }
}
