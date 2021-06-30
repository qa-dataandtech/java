package com.homework;

public class HW3 {
    public static void main(String[] args) {

        //  write a program that will print all numbers those are divided by 100 between 1 to 10000 (ex.  100, 200, 300, 400 ....10000)
        for (int i = 1; i <=10000 ; i++) {
            if (i %100 == 0) {
                System.out.println(i);
            }
        }
    }
}
