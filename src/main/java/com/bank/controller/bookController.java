package com.bank.controller;

import com.bank.pojo.*;
import com.bank.service.bookService;
import com.bank.service.readerService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-*.xml")
@Controller
public class bookController {
    @Autowired
    bookService bookService;
    @Autowired
    readerService readerService;
    /*****
                *****
            首页模块
        *****
                    *****/
    /*返回所有类型书籍列表*/
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
    /*****
                *****
            搜索模块
        *****
                    *****/
    /*搜索相关书籍、传入关键字*/
    @RequestMapping("selbook")
    public String selbook(String key,Model model){
        model.addAttribute("key",key);
        return "searchPage";
    }
    /*搜索内容流加载*/
    /*利用ajax进行动态加载*/
    @RequestMapping("seltest")
    @ResponseBody
    public Map<Integer ,Object> seltest(Selpojo selpojo){
        PageHelper.startPage(selpojo.getPage(),5);
        List<Book> bookList=bookService.seltest(selpojo);
        PageInfo pageInfo=new PageInfo(bookList);
        Map<Integer,Object> map=new HashMap<>();
        map.put(1,pageInfo.getList());
        map.put(2,pageInfo.getPages());
        return map;
    }
    /*返回点击的书籍详情内容页面*/
    @RequestMapping("selcont")
    public String bookcont(Integer bookid,Model model){
        System.out.println(bookid);
        model.addAttribute("cont",bookService.selcont(bookid));
        return "bookcontent";
    }
    /*****
                *****
            书籍评分模块
        *****
                    *****/
    /*书籍评分*/
    @Test
    @RequestMapping("rate")
    @ResponseBody/*回传到页面提示评分成功*/
    public String rate(Rate rate){
        System.out.println(rate.getRate());
        if (bookService.selrate(rate)){/*判断是不是第一次*/
            if (bookService.rate(rate))/*第一次评价*/{
                bookService.updatarate(rate.getBookid());
                return "success";
            }

            else {
                return "fail";
            }
        }
        else{
            if (bookService.updatarate2(rate))/*非第一次*/{
                bookService.updatarate(rate.getBookid());
                return "success";
            }
            else {
                return "fail";
            }
        }
    }
    /*对书籍进行评论*/
    @RequestMapping("newcom")//获得bookid、readername、comment
    @ResponseBody/*回传到页面提示评论成功*/
    public String newcom(Comment comment){
        System.out.println(comment.getReadername());
        System.out.println(comment.getBookid());
        System.out.println(comment.getComment());
        if (bookService.newcom(comment))
            return "success";
        else
            return "fail";
    }
    /*****
                *****
            书籍评论模块
        *****
                    *****/
    /*返回该书所有评论*/
    @RequestMapping("allcom")
    @ResponseBody/*在页面初加载是查询*/
    public List<CommentP> allcom(Integer bookid){
        return bookService.allcom(bookid);
    }
}
