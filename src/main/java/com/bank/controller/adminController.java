package com.bank.controller;

import com.bank.pojo.Book;
import com.bank.pojo.Reader;
import com.bank.service.bookService;
import com.bank.service.readerService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class adminController {
    @Autowired
    readerService readerService;
    @Autowired
    bookService bookService;
    @RequestMapping("allreader")
    @ResponseBody
    public PageInfo<Reader>allreader(@RequestParam("page")Integer page,@RequestParam("limit")Integer limit){
        PageHelper.startPage(page,limit);
        List<Reader> readerList=readerService.allreader();
        PageInfo<Reader> readerPageInfo=new PageInfo<>(readerList);
        return readerPageInfo;
    }
    @RequestMapping("allbook")
    @ResponseBody
    public PageInfo<Book>allbook(@RequestParam("page")Integer page,@RequestParam("limit")Integer limit){
        PageHelper.startPage(page,limit);
        List<Book>bookList=bookService.allbook();
        PageInfo<Book> bookPageInfo=new PageInfo<>(bookList);
        return bookPageInfo;
    }
    @RequestMapping("updateRmsg")
    public String updateRmsg(Reader reader){
        return null;
    }
    @RequestMapping("changeStatus")
    @ResponseBody
    public String changeStatus(@RequestParam("readerid")Integer readerid,@RequestParam("status")Integer status){
        if (readerService.changestatus(readerid,status)){
            return "success";
        }
        else return "fail";
    }
    @RequestMapping("addbook")
    @ResponseBody
    public String addbook(Book book){
        if (bookService.addbook(book)){
            return "success";
        }
        else
            return "fail";
    }
}
