package com.BookQueryB.service.impl;

import com.BookQueryB.dao.BookQuertDao;
import com.BookQueryB.dao.impl.BookQueryDaoImpl;
import com.BookQueryB.entity.BookQuery;
import com.BookQueryB.service.BookQueryService;

import java.util.List;

/**
 * @ClassName BookQueryServiceImpl
 * @Author KaoRouFan
 * @Date 2023/6/14 上午 9:57
 * @Version 1.0
 */
public class BookQueryServiceImpl implements BookQueryService {
    private BookQuertDao bookQuertDao = new BookQueryDaoImpl();
    @Override
    public List<BookQuery> findBookQuery(String bookName, String bookAuthor, String bookType) {
        List<BookQuery> list = bookQuertDao.findBookQuery(bookName,bookAuthor,bookType);
        return list;
    }

    @Override
    public BookQuery findBookQueryById(String bookId) {
        BookQuery bq = bookQuertDao.findBookQueryById(bookId);
        return bq;
    }
}
