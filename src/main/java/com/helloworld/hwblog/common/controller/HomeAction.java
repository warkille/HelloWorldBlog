package com.helloworld.hwblog.common.controller;

import com.helloworld.hwblog.blog.model.ArticleTypeModel;
import com.helloworld.hwblog.blog.service.ArticleTypeService;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * Created by xdzy on 2017/5/3.
 */
@Controller
public class HomeAction extends ActionSupport{
    @Autowired
    private ArticleTypeService articleTypeService;

    public void setArticleTypeService(ArticleTypeService articleTypeService) {
        this.articleTypeService = articleTypeService;
    }

    public String home(){
        List<ArticleTypeModel> list=articleTypeService.getArticleTypeList();
        ServletActionContext.getRequest().setAttribute("typeList",list);
        return "success";
    }
}
