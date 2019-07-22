package com.bank.service.serviceImpl;

import com.bank.dao.UserMapper;
import com.bank.pojo.User;
import com.bank.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.MessageDigest;
import java.util.List;
@Service
public class userServiceImpl implements userService {
    @Autowired
    UserMapper userMapper;
    @Override
    public Boolean userLogin(User user) {
        String passwordmd5=MD5(user.getPassword());
        user.setPassword(passwordmd5);
        if (userMapper.userLogin(user).size()==1)
            return true;
        else
            return false;
    }

    @Override
    public List<User> showUsers() {

        return userMapper.showUsers();
    }

    @Override
    public void dataSave(User user) {
        String passwordmd5= MD5(user.getPassword());
        user.setPassword(passwordmd5);
        userMapper.dataSave(user);
    }


    /*密码加密*/
    public static String MD5(String inStr) {
        MessageDigest md5 = null;
        try {
            md5 = MessageDigest.getInstance("MD5");
        } catch (Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
            return "";
        }
        char[] charArray = inStr.toCharArray();
        byte[] byteArray = new byte[charArray.length];

        for (int i = 0; i < charArray.length; i++)
            byteArray[i] = (byte) charArray[i];

        byte[] md5Bytes = md5.digest(byteArray);

        StringBuffer hexValue = new StringBuffer();

        for (int i = 0; i < md5Bytes.length; i++) {
            int val = ((int) md5Bytes[i]) & 0xff;
            if (val < 16)
                hexValue.append("0");
            hexValue.append(Integer.toHexString(val));
        }

        return hexValue.toString();
    }

    // 可逆的加密算法
    public static String KL(String inStr) {
        // String s = new String(inStr);
        char[] a = inStr.toCharArray();
        for (int i = 0; i < a.length; i++) {
            a[i] = (char) (a[i] ^ 't');
        }
        String s = new String(a);
        return s;
    }

    // 加密后解密
    public static String JM(String inStr) {
        char[] a = inStr.toCharArray();
        for (int i = 0; i < a.length; i++) {
            a[i] = (char) (a[i] ^ 't');
        }
        String k = new String(a);
        return k;
    }
}
