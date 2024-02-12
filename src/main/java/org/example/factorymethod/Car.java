package org.example.factorymethod;

public class Car implements Vehicle{
    @Override
    public void start() {
        System.out.println("Car Started");
    }
}
