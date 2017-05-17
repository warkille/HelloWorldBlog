package com.helloworld.hwblog.blog.service;

import com.helloworld.hwblog.blog.model.ArticleTypeModel;

import java.util.List;

/**
 * Created by xdzy on 17-5-12.
 */
public interface ArticleTypeService {
    boolean addArticleType(ArticleTypeModel model);
    List<ArticleTypeModel> getArticleTypeList();
    String getArticleTypeList_JSON();
    boolean deleteArticleType(int typeNumber);
}
