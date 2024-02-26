package org.example.factorymethod.example2milkshake;

public class Client {
    public static void main(String[] args) {
        MilkshakeFactory milkshakeFactory = new MilkshakeFactory();
        milkshakeFactory.prepare(MilkshakeName.BUTTERSCOTCH_MILKSHAKE);
    }
}
