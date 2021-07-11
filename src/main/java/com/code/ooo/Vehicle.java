package com.code.ooo;

public class Vehicle implements IVehicle{
    protected String name;
    protected String engine;
    protected String vin;

    public Vehicle(String name, String engine, String vin) {
        this.name = name;
        this.engine = engine;
        this.vin = vin;
    }

    public void honk() {
        System.out.println("default honk");
    }

    public void startEngine() {
        System.out.println("Engine statrs");
    }
}
