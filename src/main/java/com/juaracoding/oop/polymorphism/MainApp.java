package com.juaracoding.oop.polymorphism;

public class MainApp {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.sum(10,11);
        calculator.sum(10,11,12);
        calculator.sum(10.5, 11.5);

        //cara instance basic class dan object
        BangunDatar bangunDatar = new BangunDatar();
        bangunDatar.draw();

        // cara instance method overriding
        BangunDatar kotak = new Kotak();
        kotak.draw();
    }
}
