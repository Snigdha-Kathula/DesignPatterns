package org.example.decorator;

public class ChocoCone implements IceCream{
    private IceCream iceCream;

    public ChocoCone() {
    }

    public ChocoCone(IceCream iceCream) {
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
        if(iceCream !=null){
            return iceCream.getDes()+"ChocoCone ";
        }
        return "ChocoCone ";
    }
}
