package com.bank.service.serviceImpl;

import com.bank.dao.ReaderMapper;
import com.bank.pojo.Reader;
import com.bank.service.readerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class readerServiceImpl implements readerService {
    @Autowired
    ReaderMapper readerMapper;

    @Override
    public Integer selid(String readername) {
        return readerMapper.selid(readername);
    }

    @Override
    public boolean readerLogin(Reader reader) {
        if (readerMapper.readerLogin(reader).size()==1){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public boolean readerRes(Reader reader) {
        if (readerMapper.readerRes(reader)==1){
            return true;
        }
        else if (readerMapper.readerRes(reader)==0){
            return false;
        }
        else
            return false;
    }
}
