package com.code.collection;

import java.util.HashSet;

public class SetExample {
    public static void main(String[] args) {
        HashSet<Integer> myList = new HashSet<>();
        myList.add(5);
        myList.add(6);
        myList.add(7);
        myList.add(5);
        myList.add(6);
        myList.add(7);

        for (Integer myval : myList) {
            System.out.println(myval);
        }
    }
}
