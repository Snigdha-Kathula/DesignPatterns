package org.example.observer;

public class CurrentConditionsDisplay implements Observer{
    private double temparature;
    private double humidity;
    private double pressure;
    @Override
    public void update(double temperature, double humidity, double pressure) {
        this.temparature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    @Override
    public void display() {
        System.out.println("CurrentConditions :- \n"+"temparature :" +temparature+",\n"+"humidity :"+humidity+"\n"+"pressure :"+pressure);
    }
}
