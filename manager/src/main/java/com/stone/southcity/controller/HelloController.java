package com.stone.southcity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by chenchen on 2016/3/27.
 */
@Controller
@RequestMapping(value = "/hello")
public class HelloController {

    @RequestMapping(value = "/showpage")
    public String showPage(){
        String path = "hello";
        return path;
    }

    @RequestMapping(value = "/login")
    public String login(){
        String path = "login";
        return path;
    }
}

