package com.company;

public class Toyota extends Car{
    private String emblem;


    public Toyota(String name, String marka, String color, String emblem) {
        super(name, marka, color);
        this.emblem = emblem;
    }

    @Override
    public String toString() {
        return "Toyota{" +
                "emblem='" + emblem+ '\'' +
                "} " + super.toString();
    }

    @Override
    void getVoice() {
        System.out.println("rides faster");;
    }
    void getVolume () {
        System.out.println(5000);
    }
}
