package com.bank.controller;

import com.bank.pojo.Photo;
import com.bank.service.serviceImpl.maerServiceImpl;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-*.xml")
@Controller
public class photoController {
    @Autowired
    maerServiceImpl maerService;
    @RequestMapping("photoup")
    public String photo(@RequestParam("file") MultipartFile file, Photo photo, Model model) throws IOException {

        /**
         * 上传图片
         */
        //图片上传成功后，将图片的地址写到数据库
        String filePath = "D:\\tomimg";//保存图片的路径,tomcat中有配置
        //获取原始图片的拓展名
        if (file==null){
            System.out.println("为空");
        }
        String originalFilename = file.getOriginalFilename();
        //新的文件名字，使用uuid随机生成数+原始图片名字，这样不会重复
        String newFileName = UUID.randomUUID()+originalFilename;
        //封装上传文件位置的全路径，就是硬盘路径+文件名
        File targetFile = new File(filePath,newFileName);
        //把本地文件上传到已经封装好的文件位置的全路径就是上面的targetFile
        file.transferTo(targetFile);
        photo.setPhotoadd(newFileName);//文件名保存到实体类对应属性上

        /**
         * 保存商品
         */
        maerService.photoupload(photo);
        String img=maerService.good(1);
        model.addAttribute("img",img);
        return "success";
    }
}
