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
