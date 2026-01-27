package com.example;

public class activities {
    String color;
    String transmission;
    int make;
    int tyres;
    int doors;
    public activities() {
          tyres = 4;
        doors = 4;
    }
    void displayCharacteristics() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Color: " + color);
        System.out.println("Transmission: " + transmission);
        System.out.println("Tyres: " + tyres);
        System.out.println("Doors: " + doors);
    }
    void accelerate() {
        System.out.println("Car is moving forward.");
    }

    void brake() {
        System.out.println("Car has stopped.");
    }
}        


    

