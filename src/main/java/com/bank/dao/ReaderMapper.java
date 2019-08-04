package com.bank.dao;

import com.bank.pojo.Reader;
import org.apache.ibatis.annotations.Param;

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
    /*更改当前用户的封禁状态*/
    boolean changestatus(@Param("readerid")Integer readerid,@Param("status")Integer status);
}