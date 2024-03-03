package org.example.abstractFactory;

public class client {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new AbstractFactory(new WindowsFactory());
    }
}
// Abstract Factory :-
// an interface or abstract class for creating families of related objects,
// without specifying their concrete sub classes
