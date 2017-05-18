package com.helloworld.hwblog.common.controller;

import org.springframework.stereotype.Controller;

/**
 * Created by xdzy on 17-5-15.
 */
@Controller
public class NotFoundController {

    public String toPage(){
        return "success";
    }
}
