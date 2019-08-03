package com.bank.service;

import com.bank.pojo.Reader;

import java.util.List;

public interface readerService {
    /*
    * 读者部分
    * */
    Integer selid(String readername);
    /*读者登陆*/
    boolean readerLogin(Reader reader);
    /*读者注册*/
    boolean readerRes(Reader reader);
    /*
    *管理员部分
    * */
    /*返回所有用户*/
    List<Reader> allreader();
}
