package com.bank.controller;

import com.bank.pojo.Reader;
import com.bank.service.bookService;
import com.bank.service.readerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpSession;

/*@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-*.xml")*/
@Controller
public class readerController {
    /*注入读者服务*/
    @Autowired
    readerService readerService;
    /*注入书籍服务*/
    @Autowired
    bookService bookService;
    /*注入session，方便直接调用*/
    @Autowired
    HttpSession httpSession;
    /*****
                *****
            读者登录模块
        *****
                    *****/
    @RequestMapping("readerLogin")
    public String readerLogin(Reader reader, Model model) {
        model.addAttribute("A",bookService.Abook());
        model.addAttribute("B",bookService.Bbook());
        model.addAttribute("C",bookService.Cbook());
        model.addAttribute("D",bookService.Dbook());
        model.addAttribute("E",bookService.Ebook());
        model.addAttribute("F",bookService.Fbook());
        if (readerService.readerLogin(reader)== true) {
            httpSession.setAttribute("user",reader.getReadername());//获取读者name存入session
            System.out.println(reader.getReadername()+"这是用户名");
            httpSession.setAttribute("readerid",readerService.selid(reader.getReadername()));//以读者name获取读者id，存入session
            System.out.println("zheshi "+readerService.selid(reader.getReadername()));
            return "headPage";
        } else {
            return "loginIndex";
        }
    }
    /*****
                *****
            获取读者信息模块
        *****
                    *****/
    /*从session获取读者name*/
    @RequestMapping("getsession")
    @ResponseBody
    public String getsession(){
        return (String) httpSession.getAttribute("user");
    }
    /*从session获取读者id*/
    @RequestMapping("getreaderid")
    @ResponseBody
    public int getreaderid(){
        return (int) httpSession.getAttribute("readerid");
    }
    /*****
                *****
            读者注册模块
        *****
                    *****/
    /*读者注册*/
    @RequestMapping("readerRes")
    public String readerRes(Reader reader){
        if (readerService.readerRes(reader)==true){
            return "loginIndex";
        }
        else
            return "readerResPage";
    }
    /*****
                *****
            读者个人中心模块
        *****
                    *****/
    /*返回个人中心页面*/
    @RequestMapping("personCenter")
    public String person(Integer id,Model model){
        return null;
    }
}
