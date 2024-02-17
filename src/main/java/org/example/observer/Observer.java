package org.example.observer;

public interface Observer {
    void update(double temperature, double humidity, double pressure);
    void display();
}
