package com.code.collection;

import java.util.ArrayList;

public class Listexample {
    public static void main(String[] args) {
        // create array variable with values
//        int[] var6 = new int[3];
//        var6[0] = 5;
//        var6[1] = 6;
//        var6[2] = 7;
//        var6[3] = 8;
//
//        // print array values using for loop
//        for (int i = 0; i <= var6.length; i++) {
//            System.out.println(var6[i]);
//        }


        ArrayList<Integer> myList = new ArrayList<>();

        myList.add(5);
        myList.add(6);
        myList.add(7);
        myList.add(8);
        myList.add(9);
        myList.add(10);


        for (Integer myval : myList) {
            System.out.println(myval);
        }

    }
}
