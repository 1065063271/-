package com.bank.dao;

import com.bank.pojo.*;

import java.util.List;

public interface BookMapper {
    /*分类查询*/
    List<Book> Abook();
    List<Book> Bbook();
    List<Book> Cbook();
    List<Book> Dbook();
    List<Book> Ebook();
    List<Book> Fbook();
    /*流，按书名模糊查询*/
    List<Book> seltest(Selpojo selpojo);
    /*携带id搜索书籍相关内容*/
    Book selcont(Integer bookid);
    /*判断是否第一次评分*/
    List<Rate> selrate(Rate rate);
    /*第一次书籍评分*/
    boolean rate(Rate rate);
    /*非第一次评分*/
    Boolean updataratet(Rate rate);
    /*更新书籍平均评分*/
    boolean updatarate(Integer bookid);
    /*对书籍进行评论*/
    boolean newcom(Comment comment);
    /*返回该书所有评论*/
    List<CommentP> allcom(Integer bookid);


}