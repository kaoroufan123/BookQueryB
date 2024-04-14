package com.BookQueryB.dao.impl;

import com.BookQueryB.dao.BaseDao;
import com.BookQueryB.dao.BookQuertDao;
import com.BookQueryB.entity.BookQuery;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName BookQueryDaoImpl
 * @Author KaoRouFan
 * @Date 2023/6/14 上午 9:06
 * @Version 1.0
 */
public class BookQueryDaoImpl extends BaseDao implements BookQuertDao {
    @Override
    public List<BookQuery> findBookQuery(String bookName,String bookAuthor,String bookType) {
        Connection conn = null;
        ResultSet rs = null;
        String sql = null;
        String [] params = null;
        List<BookQuery> list = new ArrayList<>();
        BookQuery bookQuery = null;
        try{
            conn = getConnection();
            if(bookName!=null&&bookAuthor!=null){
                sql = "SELECT * FROM bookquery where bookName = ? and bookAuthor = ?  and  bookType = ?";
                params = new String[]{bookName,bookAuthor,bookType};
            }else if(bookName!=null&&bookAuthor==null){
                sql = "SELECT * FROM bookquery where bookName = ?  and  bookType = ?";
                params =  new String[]{bookName,bookType};
            }else if(bookName == null && bookAuthor!=null){
                sql = "SELECT * FROM bookquery where bookAuthor = ?  and  bookType = ?";
                params =  new String[]{bookAuthor,bookType};
            }else if(bookName == null && bookAuthor == null &&!"历史".equals( bookType)){
                sql = "SELECT * FROM bookquery where bookType = ?";
                params =  new String[]{bookType};
            }else if(bookName == null && bookAuthor == null &&"历史".equals(bookType)){
                sql = "SELECT * FROM bookquery ";
            }
            rs = excute(conn,sql,params);
            while(rs.next()){
                bookQuery = new BookQuery();
                bookQuery.setBookId(rs.getString("bookId"));
                bookQuery.setBookName(rs.getString("bookName"));
                bookQuery.setBookAuthor(rs.getString("bookAuthor"));
                bookQuery.setBookConcern(rs.getString("bookConcern"));
                bookQuery.setBookType(rs.getString("bookType"));
                bookQuery.setBookTime(rs.getDate("bookTime"));
                bookQuery.setBookDescription(rs.getString("bookDescription"));
                list.add(bookQuery);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally{
            close(conn,null,rs);
        }
        return list;
    }

    @Override
    public BookQuery findBookQueryById(String bookId) {
        Connection conn = null;
        ResultSet rs = null;
        BookQuery bookQuery = null;

        try{
            conn = getConnection();
            String sql = "select * from bookquery where bookId = ?";
            String [] params = {String.valueOf(bookId)};
            rs = excute(conn,sql,params);
            while(rs.next()){
                bookQuery = new BookQuery();
                bookQuery.setBookId(rs.getString("bookId"));
                bookQuery.setBookName(rs.getString("bookName"));
                bookQuery.setBookAuthor(rs.getString("bookAuthor"));
                bookQuery.setBookConcern(rs.getString("bookConcern"));
                bookQuery.setBookType(rs.getString("bookType"));
                bookQuery.setBookTime(rs.getDate("bookTime"));
                bookQuery.setBookDescription(rs.getString("bookDescription"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return bookQuery;
    }
}
