package com.code.ifelse;

public class IfElseExample3 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        // a > b -> print "a is grater than b"
        // a < b -> print "a is less than b"
        // a == b -> print "a equal b"
        // otherwise print "nothing is true "

        if (a > b) {
            System.out.println("a is grater than b");
        } else if (a < b) {
            System.out.println(" a is less than b");
        } else if (a == b) {
            System.out.println(" a equal b");
        } else {
            System.out.println("nothing is true");
        }
    }
}
