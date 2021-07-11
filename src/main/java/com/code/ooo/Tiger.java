package com.code.ooo;

public class Tiger extends Animal{
    public Tiger(String color, boolean hasHead) {
        super(color, hasHead);
    }

    @Override
    public void honk() {
        System.out.println("Tiger hunk");
    }
}
