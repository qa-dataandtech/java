package com.homework;

public class HW4 {
    public static void main(String[] args) {
        //   write a program where one variable can store 10 boolean values and then print them  (ex. true, true, true, true ....)
      //  boolean[] myvar = new boolean[] {true, false, true, false, true, false, true, false, true, false};

        boolean[] myvar = new boolean[10];
        myvar[0] = true;
        myvar[1] = false;
        myvar[2] = false;
        myvar[3] = false;
        myvar[4] = false;
        myvar[5] = false;
        myvar[6] = false;
        myvar[7] = false;
        myvar[8] = false;
        myvar[9] = false;


        for (int i = 0; i < myvar.length ; i++) {
            System.out.println(myvar[i]);
        }

    }
}
