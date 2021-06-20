package com.code.string;

public class StringExample2 {

    public static void main(String[] args) {
        // string class reference: https://docs.oracle.com/javase/7/docs/api/java/lang/String.html

        String var1 = "     my name is sam      ";

        // removing spaces from front and back of a string and print
        System.out.println(var1.trim());

        // find length of a string and print
        System.out.println(var1.length());

        // find first character of a string and print
        System.out.println(var1.charAt(0));

    }
}
