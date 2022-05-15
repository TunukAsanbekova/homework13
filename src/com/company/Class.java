package com.company;

import java.util.Arrays;

public class Class {
    private int number;
    private String soz;
    private int[] arr = new int[6];

    public Class(int number, String soz, int[] arr) {
        this.number = number;
        this.soz = soz;
        this.arr = arr;
    }

    public Class() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getSoz() {
        return soz;
    }

    public void setSoz(String soz) {
        this.soz = soz;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    @Override
    public String toString() {
        return "Class{" +
                "number=" + number +
                ", soz='" + soz + '\'' +
                ", arr=" + Arrays.toString(arr) +
                '}';
    }
}


