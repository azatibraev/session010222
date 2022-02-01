package com.company.Laptop;

public class Main {
    public static void main(String[] args) {
        Laptop asus = new Laptop();
        asus.brand = " Asus ";
        asus.color = " Silver";
        asus.hdd = 500;
        asus.ram = 800;
        asus.graphicCard = "Nvidia";


        Laptop acer = new Laptop();
        acer.brand = " Acer ";
        acer.color = " black";
        acer.hdd = 400;
        acer.ram = 700;
        acer.graphicCard = "GeForce";

        Laptop hp = new Laptop();
        hp.brand = " Hp ";
        hp.color = " White";
        hp.hdd = 600;
        hp.ram = 500;
        hp.graphicCard = "Amd";

        asus.powerOn();
        asus.powerOff();

        acer.powerOn();
        acer.powerOff();

        hp.powerOn();
        hp.powerOff();
    }
}