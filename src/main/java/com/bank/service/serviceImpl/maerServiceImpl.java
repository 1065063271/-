package com.bank.service.serviceImpl;

import com.bank.dao.MaerMapper;
import com.bank.pojo.Photo;
import com.bank.service.maerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class maerServiceImpl implements maerService {
    @Autowired
    MaerMapper maerMapper;
    @Override
    public void photoupload(Photo photo) {
        maerMapper.photoupload(photo);
    }

    @Override
    public String  good(Integer goodid) {
        return maerMapper.good(goodid);
    }
}
