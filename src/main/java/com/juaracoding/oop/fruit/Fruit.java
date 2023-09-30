package com.juaracoding.oop.fruit;

public class Fruit {
        //state
        public int grams, calPerGram;

        //behaviour
        public int totalCalories(){
            return grams*calPerGram;
        }
}
