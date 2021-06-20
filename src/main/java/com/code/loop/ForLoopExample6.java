package com.code.loop;

public class ForLoopExample6 {
    public static void main(String[] args) {

        // write a program to print from 1 to 100
        for (int i = 1; i<=5; i++) {
            System.out.println(i);
        }


        // write a program that will print from 5 to 1 example: 5 4 3 2 1 using for loop
        for (int j = 5; j>=1; j--) {
            System.out.println(j--);
        }


        // write a gram to print all even number between 1 to 100
        for (int i = 1; i<=6; i++) {
                if (i % 2  == 0) {
                    System.out.println(i);
                }
        }

        // write a gram to print all odd number between 1 to 100
        for (int i = 1; i<=100; i++) {
            if (i % 2  > 0) {
                System.out.println(i);
            }
        }

        // print all the numbers from 1 to 1000 those are divided by 33
        for (int i = 1; i<=1000; i++) {
            if (i % 33  == 0) {
                System.out.println(i);
            }
        }
    }
}
