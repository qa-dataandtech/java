package com.homework;

import java.util.Scanner;

public class HW6 {
    public static void main(String[] args) {

        int[] myList = new int[3];


        Scanner myInput = new Scanner(System.in);
        System.out.println("input 3 numbers: ");

        for (int j =0 ; j < 3 ; j++) {
            myList[j] = myInput.nextInt();
        }


        System.out.println("User provided: ");
        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i]);
        }

    }
}
