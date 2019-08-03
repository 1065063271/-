package com.bank.dao;

import com.bank.pojo.Reader;

import java.util.List;

public interface ReaderMapper {
    /*
    * 读者部分
    * */
    /*以name查找用户id*/
    Integer selid(String readername);
    /*读者登陆*/
    List<Reader> readerLogin(Reader reader);
    /*读者注册*/
    int readerRes(Reader reader);
    /*
    * 管理员部分
    * */
    /*返回所有用户信息*/
    List<Reader>allreader();
}