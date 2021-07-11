package com.code.ooo;

public class Human extends Animal{
    public Human(String color, boolean hasHead) {
        super(color, hasHead);
    }

    @Override
    public void honk() {
        System.out.println("Tiger hunk");
    }
}
