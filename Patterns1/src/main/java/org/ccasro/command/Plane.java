package org.ccasro.command;

public class Plane implements Vehicle {

    private String model;

    public Plane(String model){
        this.model = model;
    }

    @Override
    public void accelerate(){
        System.out.println("The plane " + model + " is accelerating");
    }

    @Override
    public void brake(){
        System.out.println("The plane " + model + " is braking");
    }

    @Override
    public void start(){
        System.out.println("The plane " + model + " is starting");
    }
}
