package com.BookQueryB.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName BookQuery
 * @Author KaoRouFan
 * @Date 2023/6/14 上午 9:02
 * @Version 1.0
 */
public class BookQuery implements Serializable {
    private String bookId;
    private String bookName;
    private String bookAuthor;
    private String bookConcern;
    private String bookType;
    private Date bookTime;
    private String bookDescription;

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookConcern() {
        return bookConcern;
    }

    public void setBookConcern(String bookConcern) {
        this.bookConcern = bookConcern;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    public Date getBookTime() {
        return bookTime;
    }

    public void setBookTime(Date bookTime) {
        this.bookTime = bookTime;
    }

    public String getBookDescription() {
        return bookDescription;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }

    @Override
    public String toString() {
        return "BookQuery{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookConcern='" + bookConcern + '\'' +
                ", bookType='" + bookType + '\'' +
                ", bookTime='" + bookTime + '\'' +
                ", bookDescription='" + bookDescription + '\'' +
                '}';
    }
}
