package com.juaracoding.oop;

import com.juaracoding.oop.fruit.Fruit;

public class MainApp {
    public static void main(String[] args) {
        //instance class fruits
        Fruit fruit = new Fruit();
        fruit.grams = 10;
        fruit.calPerGram = 500;
        System.out.println("Total kalori : "+fruit.totalCalories());
    }
}
