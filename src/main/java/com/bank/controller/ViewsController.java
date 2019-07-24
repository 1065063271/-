package com.bank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewsController {
    @RequestMapping("login")
    public String loginIndex(){
        return "loginIndex";
    }
    @RequestMapping("first")
    public String firstPage(){
        return "firstPage";
    }
}
