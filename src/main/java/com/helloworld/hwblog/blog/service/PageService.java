package com.helloworld.hwblog.blog.service;

import com.helloworld.hwblog.blog.model.ArticleItemModel;
import com.helloworld.hwblog.common.model.PageModel;

/**
 * Created by xdzy on 17-5-13.
 */
public interface PageService {
    PageModel<ArticleItemModel> getPage(String type,int index,int count);
}
