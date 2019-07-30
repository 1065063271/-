package com.bank.controller;

import com.bank.pojo.Reader;
import com.bank.service.bookService;
import com.bank.service.readerService;
import com.bank.service.serviceImpl.bookServiceImpl;
import com.bank.service.serviceImpl.readerServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/*@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-*.xml")*/
@Controller
public class readerController {
    @Autowired
    readerService readerService;
    @Autowired
    bookService bookService;
    @Autowired
    HttpSession httpSession;
    @RequestMapping("readerLogin")
    public String readerLogin(Reader reader, Model model) {
        model.addAttribute("A",bookService.Abook());
        model.addAttribute("B",bookService.Bbook());
        model.addAttribute("C",bookService.Cbook());
        model.addAttribute("D",bookService.Dbook());
        model.addAttribute("E",bookService.Ebook());
        model.addAttribute("F",bookService.Fbook());
        if (readerService.readerLogin(reader)== true) {
            httpSession.setAttribute("user",reader.getReadername());
            httpSession.setAttribute("readerid",readerService.selid(reader.getReadername()));
            System.out.println("zheshi "+readerService.selid(reader.getReadername()));
            return "headPage";
        } else {
            return "loginIndex";
        }
    }
    @RequestMapping("getsession")
    @ResponseBody
    public String getsession(){
        return (String) httpSession.getAttribute("user");
    }
    @RequestMapping("getreaderid")
    @ResponseBody
    public int getreaderid(){
        return (int) httpSession.getAttribute("readerid");
    }
    @RequestMapping("readerRes")
    public String readerRes(Reader reader){
        if (readerService.readerRes(reader)==true){
            return "loginIndex";
        }
        else
            return "readerResPage";
    }
    /*返回个人中心*/
    @RequestMapping("person")
    public String person(Integer id,Model model){
        return null;
    }

}
