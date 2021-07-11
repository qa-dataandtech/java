package com.code.ooo;

import java.util.Date;

public class EncapsulationExample {
    public static void main(String[] args) {
              Car car1 =   new Car();

            // setters
              car1.setModel("model X");
              car1.setModelYear(new Date());
              car1.setPrice(20000.50F);


              // getters
               String modename =  car1.getModel();
                Date modelYear = car1.getModelYear();
                float price = car1.getPrice();


        System.out.println(car1.toString());
    }
}
