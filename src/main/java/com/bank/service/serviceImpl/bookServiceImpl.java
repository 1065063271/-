package com.bank.service.serviceImpl;

import com.bank.dao.BookMapper;
import com.bank.pojo.*;
import com.bank.service.bookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class bookServiceImpl implements bookService {
    @Autowired
    BookMapper bookMapper;
    /*分类查询*/
    @Override
    public List<Book> Abook() {
        return bookMapper.Abook();
    }

    @Override
    public List<Book> Bbook() {
        return bookMapper.Bbook();
    }

    @Override
    public List<Book> Cbook() {
        return bookMapper.Cbook();
    }

    @Override
    public List<Book> Dbook() {
        return bookMapper.Dbook();
    }

    @Override
    public List<Book> Ebook() {
        return bookMapper.Ebook();
    }

    @Override
    public List<Book> Fbook() {
        return bookMapper.Fbook();
    }

    @Override
    public List<Book> seltest(Selpojo selpojo) {
        return bookMapper.seltest(selpojo);
    }

    @Override
    public Book selcont(Integer bookid) {
        return bookMapper.selcont(bookid);
    }

    @Override
    public Boolean selrate(Rate rate) {
        if (bookMapper.selrate(rate).size()==0){
            return true;
        }
        else
            return false;
    }

    @Override
    public boolean rate(Rate rate) {
        if (bookMapper.rate(rate)==true)
            return true;
        else
            return false;
    }

    @Override
    public boolean updatarate2(Rate rate) {
        if (bookMapper.updataratet(rate))
            return true;
        else return false;
    }

    @Override
    public boolean updatarate(Integer bookid) {
        if (bookMapper.updatarate(bookid))
            return true;
        else
            return false;
    }

    @Override
    public boolean newcom(Comment comment) {
        if (bookMapper.newcom(comment)){
            return true;
        }
        else
            return false;
    }

    @Override
    public List<CommentP> allcom(Integer bookid) {
        return bookMapper.allcom(bookid);
    }

    @Override
    public Integer bselflower(Integer bookid) {
        return bookMapper.bselflower(bookid);
    }

    @Override
    public Integer hselflower(Integer readerid) {
        return bookMapper.hselflower(readerid);
    }

    @Override
    public boolean iszero(Integer readerid) {
        if (bookMapper.iszero(readerid)==0)
            return true;
        else
            return false;
    }

    @Override
    public boolean flowersend(Flower flower) {
        if (bookMapper.flowersend(flower))
            return true;
        else
            return false;
    }
}
