package org.example.factorymethod.example2milkshake;

public class OreoMilkshake implements Milkshake{
    public String name;

    public OreoMilkshake( ) {
        this.name = MilkshakeName.OREO_MILKSHAKE.toString();
    }
}
