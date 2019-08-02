package com.bank.dao;

import com.bank.pojo.Maer;
import com.bank.pojo.Photo;

public interface MaerMapper {
    void photoupload(Photo photo);
    String good(Integer goodid);
}