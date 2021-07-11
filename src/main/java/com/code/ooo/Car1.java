package com.code.ooo;

public class Car1 extends Vehicle{


    public Car1(String name, String engine, String vin) {
        super(name, engine, vin);
    }

    public void honk() {
        System.out.println("car honk");
    }

    @Override
    public String toString() {
        return "Car1{" +
                "name='" + name + '\'' +
                ", engine='" + engine + '\'' +
                ", vin='" + vin + '\'' +
                '}';
    }
}
