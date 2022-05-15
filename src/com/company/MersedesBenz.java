package com.company;

public class MersedesBenz extends Car{
    private int height;


    public MersedesBenz(String name, String marka, String color, int height) {
        super(name, marka, color);
        this.height = height;
    }

    @Override
    public String toString() {
        return "MersedesBenz{" +
                "height=" + height +
                "} " + super.toString();
    }

    @Override
    void getVoice() {
        System.out.println("vrum-vrum");
    }
    void turn() {
        System.out.println("MersedesBens turning");
    }
}
