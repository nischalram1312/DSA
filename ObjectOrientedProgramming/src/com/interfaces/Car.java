package com.interfaces;

public class Car implements Break,Engine{
    @Override
    public void brake() {
        System.out.println("decelerate");
    }

    @Override
    public void start() {
        System.out.println("ignition");
    }

    @Override
    public void stop() {
        System.out.println("engine stop");
    }

    @Override
    public void accelerate() {
        System.out.println("accelerate");
    }
}
