package org.example.factorymethod;

public class Client {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new CarFactory();
        Vehicle vehicle = vehicleFactory.createVehicle() ;
        vehicle.start();
    }
}
