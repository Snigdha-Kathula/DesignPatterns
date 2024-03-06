package org.example.decorator;

public class Client {
    public static void main(String[] args) {
        IceCream iceCream = new ChocoChips(
                                new ButterscotchScoop(
                                    new StrawberryScoop(
                                        new ChocoCone(
                                            new ChocoSyrup(
                                                new OrangeCone()
                                            )
                                        )
                                    )
                                )
                            );
        System.out.println(iceCream.getCost());
        System.out.println(iceCream.getDes());
    }
}
//Decorator is a structural pattern that allows adding new behaviors to objects dynamically
//by placing them inside special wrapper objects, called decorators.
//Using decorators you can wrap objects countless number of times since both target
//objects and decorators follow the same interface. The resulting object will get a
//stacking behavior of all wrappers.
