package com.code.ooo;

public class CarInfo {
    String vinNumber;
    String color;
    float engineSize;


    public CarInfo(String vinNumber) {
        this.vinNumber = vinNumber;
    }

    public CarInfo(String color, float engineSize) {
        this.color = color;
        this.engineSize = engineSize;
    }

    @Override
    public String toString() {
        return vinNumber + " " + color + " " +engineSize;
    }

}
