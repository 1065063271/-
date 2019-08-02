package com.bank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewsController {
    /*****
                *****
            视图跳转模块
        *****
                    *****/
    /*内容*/
    @RequestMapping("login")
    public String loginIndex(){
        return "loginIndex";
    }
    /*测试*/
    @RequestMapping("first")
    public String firstPage(){
        return "firstPage";
    }
    /*测试*/
    @RequestMapping("search")
    public String searchP(){
        return "searchPage";
    }
    /*内容*/
    @RequestMapping("person")
    public String personPage(){
        return "readerperson";
    }
    @RequestMapping("photo")
    public String photo(){
        return "phototest";
    }
    @RequestMapping("admin")
    public String admin(){
        return "adminPage";
    }
}
