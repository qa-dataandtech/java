package com.code.ooo;

public abstract class Animal {
    private String color;
    private boolean hasHead;

    public Animal(String color, boolean hasHead) {
        this.color = color;
        this.hasHead = hasHead;
    }

    abstract public void honk();
}
