package org.example.decorator;

public class ButterscotchScoop implements IceCream{
    private IceCream iceCream;

    public ButterscotchScoop(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        return iceCream.getCost()+10;
    }

    @Override
    public String getDes() {
        return iceCream.getDes()+"ButterScotchScoop ";
    }
}
