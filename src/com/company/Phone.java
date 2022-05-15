package com.company;

import java.util.Random;

public class Phone {
    private String model;
    private int price;

    public Phone(String a) {
        model = a;

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
