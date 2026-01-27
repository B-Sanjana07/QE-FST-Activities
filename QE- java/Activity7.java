package com.example;

interface BicycleParts {
    int maxSpeed = 120;
    int minSpeed = 0;
}

interface BicycleOperations {
    void applyBrake(int decrease);
    void speedUp(int increase);
}

class Bicycle implements BicycleParts, BicycleOperations {

    protected int gears;
    protected int currentSpeed;

    Bicycle(int gears, int currentSpeed) {
        this.gears = gears;
        this.currentSpeed = currentSpeed;
    }

    public void applyBrake(int decrease) {
        currentSpeed -= decrease;
        System.out.println("Speed after brake: " + currentSpeed);
    }

    public void speedUp(int increase) {
        currentSpeed += increase;
        System.out.println("Speed after speed up: " + currentSpeed);
    }

    public String bicycleDesc() {
        return "No of gears are: " + gears +
               "\nCurrent speed of bicycle is: " + currentSpeed;
    }
}

class MountainBike extends Bicycle {

    private int seatHeight;

    MountainBike(int gears, int currentSpeed, int seatHeight) {
        super(gears, currentSpeed);
        this.seatHeight = seatHeight;
    }

    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    @Override
    public String bicycleDesc() {
        return super.bicycleDesc() +
               "\nSeat height is: " + seatHeight;
    }
}

public class Activity7 {
    public static void main(String[] args) {

        MountainBike mb = new MountainBike(5, 10, 25);

        System.out.println(mb.bicycleDesc());

        mb.speedUp(20);
        mb.applyBrake(5);

        mb.setHeight(30);
        System.out.println("\nAfter changing seat height:");
        System.out.println(mb.bicycleDesc());
    }
}

