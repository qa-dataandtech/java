package com.code.switchex;

public class SwitchExample4 {
    public static void main(String[] args) {
        int a  = 1;

        switch(a) {
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
