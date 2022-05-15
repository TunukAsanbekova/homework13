package com.company;

public class Car {
    private String name;
    private String marka;
    private String color;

    public Car() {
    }

    public Car(String name, String marka, String color) {
        this.name = name;
        this.marka = marka;
        this.color = color;
    }

    void getVoice () {
        System.out.println("vrum-vrum");
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", marka='" + marka + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

