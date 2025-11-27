package org.ccasro.command;

public class Bicycle implements Vehicle {

    private String model;

    public Bicycle(String model){
        this.model = model;
    }

    @Override
    public void accelerate(){
        System.out.println("The bicycle " + model + " is accelerating.");
    }

    @Override
    public void brake(){
        System.out.println("The bicycle " + model + " is braking.");
    }

    @Override
    public void start(){
        System.out.println("The bicycle " + model + " is starting.");
    }
}
