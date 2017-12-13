package com.xss.test;

/**
 * Created by Holiday on 2017/12/13.
 */
public class UseBook {
    public static void main(String[] args) {
        Book book = new Book();
        book.setBookName("holiday");
        book.setPageCount(100);
        book.setPrice(100.22);
        System.out.println("书名为："+book.getBookName());
        System.out.println("书页共："+book.getPageCount());
        System.out.println("书的价格："+book.getPrice());

        Book book1,book2;
        book1 = book;
        book2 = book;
        book1.setBookName("sunny");
        book2.setBookName("summer");
        System.out.println("书名为："+book1.getBookName());

    }
}
