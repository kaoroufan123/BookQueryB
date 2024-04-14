package com.BookQueryB.dao;

import com.BookQueryB.entity.BookQuery;

import java.util.List;

/**
 * @ClassName BookQueryDao
 * @Author KaoRouFan
 * @Date 2023/6/14 上午 9:04
 * @Version 1.0
 */
public interface BookQuertDao {
    public abstract List<BookQuery> findBookQuery(String bookName,String bookAuthor,String bookType);

    public abstract BookQuery findBookQueryById(String bookId);
}
