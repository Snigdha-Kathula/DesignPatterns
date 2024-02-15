package org.example.decorator;

public class StrawberryScoop implements IceCream{
    private IceCream iceCream;

    public StrawberryScoop(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        return iceCream.getCost()+10;
    }

    @Override
    public String getDes() {
        return iceCream.getDes()+"StrawberryScoop ";
    }
}
