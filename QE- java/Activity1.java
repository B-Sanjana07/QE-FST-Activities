package com.example;

public class Activity1 {
    public static void main(String[] args) {


        activities carName = new activities();

    
        carName.make = 2014;
        carName.color = "Black";
        carName.transmission = "Manual";

    
        carName.displayCharacteristics();
        carName.accelerate();
        carName.brake();
    }
}


