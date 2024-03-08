package org.example.observer;

public class Client {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        weatherData.registerObserver(new CurrentConditionsDisplay());
        weatherData.registerObserver(new StatisticalDisplay());
        weatherData.registerObserver(new ForecastDisplay());
        weatherData.setMeasurements(80, 65, 30);
    }
}
//Observer is a behavioral design pattern that lets you define a subscription mechanism
//to notify multiple objects about any events that happen to the object they’re observing.
