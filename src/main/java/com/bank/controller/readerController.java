package com.bank.controller;

import com.bank.pojo.Reader;
import com.bank.service.serviceImpl.readerServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.bind.annotation.RequestMapping;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-*.xml")
@Controller
public class readerController {
    @Autowired
    readerServiceImpl readerService;
    @Test
    @RequestMapping("readerLogin")
    public String readerLogin(Reader reader){
        boolean is=readerService.readerLogin(reader);
        if (is==true){
            return "success";
        }
        else{
            return "fail";
        }
    }
}
