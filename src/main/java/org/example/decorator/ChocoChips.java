package org.example.decorator;

public class ChocoChips implements IceCream{
    private IceCream iceCream;

    public ChocoChips(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        return iceCream.getCost()+5;
    }

    @Override
    public String getDes() {
        return iceCream.getDes()+"ChocoChips ";
    }
}
