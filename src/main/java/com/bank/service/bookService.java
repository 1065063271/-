package com.bank.service;

import com.bank.pojo.*;

import java.util.List;

public interface bookService {
    /*分类查询*/
    List<Book> Abook();
    List<Book> Bbook();
    List<Book> Cbook();
    List<Book> Dbook();
    List<Book> Ebook();
    List<Book> Fbook();
    /*流查询测试*/
    List<Book>seltest(Selpojo selpojo);
    /*携带id查询书籍相关内容*/
    Book selcont(Integer bookid);
    /*判断是否第一次评分*/
    Boolean selrate(Rate rate);
    /*第一次书籍评分*/
    boolean rate(Rate rate);
    /*非第一次评分*/
    boolean updatarate2(Rate rate);
    /*更新书籍平均评分*/
    boolean updatarate(Integer bookid);
    /*对书籍进行评论*/
    boolean newcom(Comment comment);
    /*返回所有书籍评论*/
    List<CommentP> allcom(Integer bookid);
    /*查询书籍鲜花数*/
    Integer bselflower(Integer bookid);
    /*查询读者鲜花数*/
    Integer hselflower(Integer readerid);
    /*判断读者鲜花是否为零*/
    boolean iszero(Integer readerid);
    /*读者赠送鲜花给书籍*/
    boolean flowersend(Flower flower);
    /*
    * 管理员部分
    * */
    List<Book>allbook();
}
