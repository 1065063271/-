package com.bank.service.serviceImpl;

import com.bank.dao.BookMapper;
import com.bank.pojo.Book;
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
}
