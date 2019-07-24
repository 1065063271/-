package com.bank.dao;

import com.bank.pojo.Reader;

import java.util.List;

public interface ReaderMapper {
    /*读者登陆*/
    List<Reader> readerLogin(Reader reader);
    /*读者注册*/
    int readerRes(Reader reader);
}