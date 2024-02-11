package org.example.prototype;

public class Client {
    public static void main(String[] args) {
        ConcretePrototype prototype = new ConcretePrototype(1, "Prototype");
        ConcretePrototype clone = (ConcretePrototype) prototype.clone();
        // Now 'clone' is an exact copy of 'prototype' with the same attributes
        System.out.println(clone); // Output: ConcretePrototype{id=1, name='Prototype'}


        ChildPrototype prototype1 = new ChildPrototype(2, "Prototype", "Additional Info");
        ChildPrototype clone1 = (ChildPrototype) prototype1.clone();
        // Now 'clone' is an exact copy of 'prototype' with the same attributes
        System.out.println(clone1); // Output: ChildPrototype{id=1, name='Prototype', additionalInfo='Additional Info'}

    }
}



