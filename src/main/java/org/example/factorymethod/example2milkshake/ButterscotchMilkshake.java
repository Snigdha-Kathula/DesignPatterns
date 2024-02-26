package org.example.factorymethod.example2milkshake;

public class ButterscotchMilkshake implements Milkshake{
    public String name;

    public ButterscotchMilkshake( ) {
        this.name = MilkshakeName.BUTTERSCOTCH_MILKSHAKE.toString();
    }
}
