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

/*@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-*.xml")*/
@Controller
public class readerController {
    @Autowired
    readerService readerService;
    @Autowired
    bookService bookService;
    @RequestMapping("readerLogin")
    public String readerLogin(Reader reader, Model model) {
        model.addAttribute("A",bookService.Abook());
        model.addAttribute("B",bookService.Bbook());
        model.addAttribute("C",bookService.Cbook());
        model.addAttribute("D",bookService.Dbook());
        model.addAttribute("E",bookService.Ebook());
        model.addAttribute("F",bookService.Fbook());
        if (readerService.readerLogin(reader)== true) {
            return "headPage";
        } else {
            return "loginIndex";
        }
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
