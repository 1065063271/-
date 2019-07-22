package com.bank.dao;

import com.bank.pojo.User;

import java.util.List;

public interface UserMapper {
    //用户登录
    List<User> userLogin(User user);
    /*展示素有用户及信息*/
    List<User>showUsers();
    /*插入个人信息、日期*/
    void dataSave(User user);
}