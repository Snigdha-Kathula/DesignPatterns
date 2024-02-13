package org.example.abstractFactory;

public class client {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new AbstractFactory(new WindowsFactory());
    }
}
