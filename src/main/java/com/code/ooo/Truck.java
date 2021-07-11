package com.code.ooo;

public class Truck extends Vehicle {
    private String storage;

    public Truck(String name, String engine, String vin, String storage) {
        super(name, engine, vin);
        this.storage = storage;
    }

    public void honk() {
        System.out.println("truck honk");
    }

    @Override
    public String toString() {
        return "Truck{" +
                "storage='" + storage + '\'' +
                ", name='" + name + '\'' +
                ", engine='" + engine + '\'' +
                ", vin='" + vin + '\'' +
                '}';
    }
}
