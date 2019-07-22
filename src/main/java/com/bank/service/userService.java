package com.bank.service;

import com.bank.pojo.User;

import java.util.List;

public interface userService {
    //用户等了
    Boolean userLogin(User user);
    /*展示所 有用户及信息*/
    List<User>showUsers();
    /*cherub个人信息*/
    void dataSave(User user);
}
