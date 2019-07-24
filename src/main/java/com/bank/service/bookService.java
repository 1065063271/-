package com.bank.service;

import com.bank.pojo.Book;

import java.util.List;

public interface bookService {
    /*分类查询*/
    List<Book> Abook();
    List<Book> Bbook();
    List<Book> Cbook();
    List<Book> Dbook();
    List<Book> Ebook();
    List<Book> Fbook();
}
