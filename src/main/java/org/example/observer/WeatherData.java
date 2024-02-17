package org.example.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    private List<Observer> observersList ;
    private double temperature;
    private double humidity;
    private double pressure;

    public WeatherData() {
        this.observersList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observersList.add(observer);
        System.out.println(observer.getClass().getName()+" Registered Suceessfully!");

    }

    @Override
    public void removeObserver(Observer observer) {
        observersList.remove(observer);
        System.out.println(observer.getClass().getName()+" Removed Successfully");
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observersList){
            observer.update(temperature, humidity, pressure);
            System.out.println(observer.getClass().getName()+" temperature = "+temperature+", humudity = "+humidity+", pressure = "+pressure+". ");
        }
    }
    public void setMeasurements(double temperature, double humidity, double pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
        System.out.println("Measurements notified & updated successfully!");
    }
}
