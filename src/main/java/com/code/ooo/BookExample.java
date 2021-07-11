package com.code.ooo;

import java.util.Date;

public class BookExample {
    public static void main(String[] args) {

        Book myBook = new Book("Math 101", "mark xyz", "total chapter 13", new Date());

//        System.out.println(myBook.name);
//        System.out.println(myBook.author);
//        System.out.println(myBook.chapter);
//        System.out.println(myBook.publishDate);


        System.out.println(myBook.toString());
    }
}
