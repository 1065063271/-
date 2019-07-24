package com.bank.controller;

import com.bank.pojo.Book;
import com.bank.service.bookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-*.xml")
@Controller
public class bookController {
    @Autowired
    bookService bookService;
    @Test
    @RequestMapping("alltype")
    public String alltype(Model model){
        model.addAttribute("A",bookService.Abook());
        model.addAttribute("B",bookService.Bbook());
        model.addAttribute("C",bookService.Cbook());
        model.addAttribute("D",bookService.Dbook());
        model.addAttribute("E",bookService.Ebook());
        model.addAttribute("F",bookService.Fbook());
        return "headPage";
    }
    /*搜索相关书籍*/
    @RequestMapping("selbook")
    public String selbook(String key,Model model){
        return null;
    }
}
