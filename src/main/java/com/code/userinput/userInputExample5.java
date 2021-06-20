package com.code.userinput;

import java.util.Scanner;

public class userInputExample5 {
    public static void main(String[] args) {
        // scanner class reference: https://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html

        Scanner myInput = new Scanner(System.in);
        System.out.println("Enter a value from 1 to 5: ");
        int input = myInput.nextInt();

        switch(input) {

            case 1:
                System.out.println("turn off rocket");
                break;
            case 2:
                System.out.println("turn on rocket");
                break;
            case 3:
                System.out.println("left turn rocket");
                break;
            default:
                System.out.println("don't do anything");
                break;
        }
    }
}
