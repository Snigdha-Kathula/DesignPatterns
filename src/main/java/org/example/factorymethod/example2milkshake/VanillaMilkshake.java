package org.example.factorymethod.example2milkshake;

public class VanillaMilkshake implements Milkshake{
    public String name;

    public VanillaMilkshake() {
        this.name = MilkshakeName.VANILLA_MILKSHAKE.toString();
    }
}
