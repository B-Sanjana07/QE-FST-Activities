package com.example;

import java.util.ArrayList;
import java.util.Date;

class Plane {

    private ArrayList<String> passengers;
    private int maxPassengers;
    private Date lastTimeTakeOff;
    private Date lastTimeLanded;

    Plane(int maxPassengers) {
        this.maxPassengers = maxPassengers;
        passengers = new ArrayList<>();
    }

    void onboard(String name) {
        if (passengers.size() < maxPassengers) {
            passengers.add(name);
        }
    }

    Date takeOff() {
        lastTimeTakeOff = new Date();
        return lastTimeTakeOff;
    }

    void land() {
        lastTimeLanded = new Date();
        passengers.clear();
    }

    Date getLastTimeLanded() {
        return lastTimeLanded;
    }

    ArrayList<String> getPassengers() {
        return passengers;
    }
}

public class Activity6 {
    public static void main(String[] args) throws Exception {

        Plane plane = new Plane(10);

        plane.onboard("Alice");
        plane.onboard("Bob");

        System.out.println("Take off time: " + plane.takeOff());
        System.out.println("Passengers: " + plane.getPassengers());

        Thread.sleep(5000);

        plane.land();
        System.out.println("Landing time: " + plane.getLastTimeLanded());
    }
}
