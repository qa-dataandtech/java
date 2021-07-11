package com.code.ooo;

import java.util.Date;

public class MovieExample {
    public static void main(String[] args) {

//        Movie obj1 = new Movie();
//
        Movie  obj2  =   new Movie("movie 1", new Date(), "a, b, c, d");
        System.out.println("-------obj2 printing ");

        System.out.println(obj2.name);
        System.out.println(obj2.releaseDate);
        System.out.println(obj2.cast);
        System.out.println(obj2.length);



        Movie  obj3 =  new Movie("movie 2", new Date("09/08/1998"), "y,i,o ,u", 2.4F);
        System.out.println("-------obj3 printing ");

        System.out.println(obj3.name);
        System.out.println(obj3.releaseDate);
        System.out.println(obj3.cast);
        System.out.println(obj3.length);
    }
}
