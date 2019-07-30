package com.bank.service;

import com.bank.pojo.Reader;

public interface readerService {
    Integer selid(String readername);
    /*读者登陆*/
    boolean readerLogin(Reader reader);
    /*读者注册*/
    boolean readerRes(Reader reader);
}
