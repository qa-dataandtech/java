package com.code.ooo;

public class InheritanceExample {
    public static void main(String[] args) {
        IVehicle myCar =   new Car1("toyota", "3.2L", "12345678");
        myCar.honk();

        IVehicle myTruck = new Truck("volvo", "5.2L", "1318246712468712", "2Ton");
        myTruck.honk();

        IVehicle myBike = new Bike("hD", "1.2L", "4234782364287364827");
        myBike.honk();
    }
}