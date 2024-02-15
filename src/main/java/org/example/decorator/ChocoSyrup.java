package org.example.decorator;

public class ChocoSyrup implements IceCream{
    private IceCream iceCream;

    public ChocoSyrup(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        return iceCream.getCost()+5;
    }

    @Override
    public String getDes() {
        return iceCream.getDes()+"ChocoSyrup ";
    }
}
