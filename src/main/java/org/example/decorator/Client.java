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
