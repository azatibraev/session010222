package com.company.Laptop;

public class Laptop {
    String brand;
    String color;
    int hdd;
    double ram;
    String graphicCard;

    public void powerOn(){
        System.out.println(brand + color + " " + hdd + " " + ram + " " + graphicCard + " >>> " + " Power on");
    }
    public void powerOff(){
        System.out.println(brand + color + hdd+ " " + ram + " " + graphicCard + " >>> " + " Power off!!!");
    }


}
