package com.code.ooo;


import java.util.Date;

public class Book {
    public String name;
    public String author;
    public String chapter;
    public Date publishDate;

    public Book(String name, String author, String chapter, Date publishDate) {
        this.name = name;
        this.author = author;
        this.chapter = chapter;
        this.publishDate = publishDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", chapter='" + chapter + '\'' +
                ", publishDate=" + publishDate +
                '}';
    }
}
