package org.example.decorator;

public class OrangeCone implements IceCream{
    private IceCream iceCream;

    public OrangeCone() {
    }

    public OrangeCone(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        if(iceCream !=null){
            return iceCream.getCost()+10;
        }
        return 10;
    }

    @Override
    public String getDes() {
        if(iceCream != null){
            return iceCream.getDes()+"OrangeCone ";
        }
        return  "OrangeCone ";
    }
}
