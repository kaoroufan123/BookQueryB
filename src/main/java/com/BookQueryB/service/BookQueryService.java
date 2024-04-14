package com.BookQueryB.service;

import com.BookQueryB.entity.BookQuery;

import java.util.List;

/**
 * @ClassName BookQueryService
 * @Author KaoRouFan
 * @Date 2023/6/14 上午 9:57
 * @Version 1.0
 */
public interface BookQueryService {
    public abstract List<BookQuery> findBookQuery(String bookName, String bookAuthor, String bookType);

    public abstract BookQuery findBookQueryById(String bookId);
}
