package com.bank.controller;

import com.bank.pojo.User;
import com.bank.service.userService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-*.xml")
@Controller
public class userController {
    @Autowired
    userService userService;
    /*用户登录*/
    @RequestMapping("userLogin")
    @ResponseBody
    /*@Test*//*junit测试*/
    public String logintest(User user){
        User user1=new User();
        if (userService.userLogin(user)){
            return "true";
        }
        else
            return "false";

    }
    /*展示所有用户*/
    @RequestMapping(value="showusers",produces="application/json;charset=UTF-8")
    @ResponseBody
    public void showusers(@RequestBody User user){/*注意此处是@Requestbody不是@Responsebody*/
        List<User> userList =userService.showUsers();
        System.out.println(userList);

    }
        /*json回传测试*/
    @RequestMapping("jsontest")
    @ResponseBody
    public List<User> jsontest(){
        return userService.showUsers();
    }
    @Test
    @RequestMapping("dataSave")
    public void dataSave(){
        Date date = null;/*初始化日期*/
        java.text.SimpleDateFormat formatter = new SimpleDateFormat( "yyyy-MM-dd");/*规定时间格式*/
        String s= "2011-07-09 ";
        try {
            date =  formatter.parse(s);/*String转Date*/
        } catch (ParseException e) {
            e.printStackTrace();
        }
        User user1=new User();
        user1.setUsername("bbb");
        user1.setPassword("bbb");
        user1.setBirthday(date);
        userService.dataSave(user1);
    }

}
