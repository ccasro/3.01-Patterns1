package org.ccasro.command;

public class Boat implements Vehicle{

    private String model;

    public Boat(String model){
        this.model = model;
    }

    @Override
    public void accelerate(){
        System.out.println("The boat " + model + " is accelerating.");
    }

    @Override
    public void brake(){
        System.out.println("The boat " + model + " is braking.");
    }

    @Override
    public void start(){
        System.out.println("The boat " + model + " is starting.");
    }
}
