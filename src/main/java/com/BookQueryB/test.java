package com.BookQueryB;

import com.BookQueryB.entity.BookQuery;
import com.BookQueryB.service.BookQueryService;
import com.BookQueryB.service.impl.BookQueryServiceImpl;

import java.util.List;

/**
 * @ClassName
 * @Author KaoRouFan
 * @Date 2023/6/14 上午 10:29
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {
        BookQueryService bookQueryService = new BookQueryServiceImpl();
        List<BookQuery> list  = bookQueryService.findBookQuery(null,null,"历史");
        System.out.println(list);
    }
}
