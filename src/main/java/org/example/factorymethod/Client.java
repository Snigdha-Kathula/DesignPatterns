package org.example.factorymethod;

public class Client {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new CarFactory();
        Vehicle vehicle = vehicleFactory.createVehicle() ;
        vehicle.start();
    }
}
//Factory Method is a creational design pattern that provides an interface for creating objects
//in a superclass, but allows subclasses to alter the type of objects that will be created.
