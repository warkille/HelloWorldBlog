package com.helloworld.hwblog.blog.controller;

import org.springframework.stereotype.Controller;

/**
 * Created by xdzy on 17-5-12.
 */
@Controller
public class TestPageController {

    public String toTestPage(){
        return "success";
    }
}
