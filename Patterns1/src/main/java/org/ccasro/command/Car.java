package org.ccasro.command;

public class Car implements Vehicle {

    private String model;

    public Car(String model) {
        this.model = model;
    }

    @Override
    public void accelerate(){
        System.out.println("The car " + model + " its accelerating.");
    }
    @Override
    public void brake(){
        System.out.println("The car " + model + " its braking.");
    }
    @Override
    public void start(){
        System.out.println("The car " + model + " its starting.");

    }
}
