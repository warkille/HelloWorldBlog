package com.helloworld.hwblog.blog.controller;

import com.helloworld.hwblog.blog.model.ArticleTypeModel;
import com.helloworld.hwblog.blog.service.ArticleTypeService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * Created by xdzy on 17-5-12.
 */
@Controller
public class ArticleTypeAction extends ActionSupport implements ModelDriven<ArticleTypeModel>{
    @Autowired
    private ArticleTypeService articleTypeService;

    private ArticleTypeModel articleTypeModel;
    public String toFormPage(){
        return "page";
    }

    public String addArticleType(){
        articleTypeService.addArticleType(articleTypeModel);
        return "success";
    }

    public String getArticleTypes(){

        return "success";
    }

    @Override
    public ArticleTypeModel getModel() {
        if(articleTypeModel==null) articleTypeModel=new ArticleTypeModel();
        return articleTypeModel;
    }
}
