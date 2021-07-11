package com.code.ooo;

import java.util.Date;

public class Car {
    private String model;
    private Date modelYear;
    private float price;


    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public Date getModelYear() {
        return modelYear;
    }

    public void setModelYear(Date modelYear) {
        this.modelYear = modelYear;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", modelYear=" + modelYear +
                ", price=" + price +
                '}';
    }
}
