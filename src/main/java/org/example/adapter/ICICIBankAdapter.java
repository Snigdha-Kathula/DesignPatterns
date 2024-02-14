package org.example.adapter;

public class ICICIBankAdapter implements BankApi{
    ICICIBank iciciBank = new ICICIBank();
    @Override
    public String transferMoney(int AccNO, int amount) {
        return iciciBank.sendMoney(AccNO, amount);
    }

    @Override
    public String withdrawMoney(int amount) {
        return iciciBank.getMoney(amount);
    }

    @Override
    public String addMoney(int AccNo, int amount) {
        return iciciBank.insertMoney(amount);
    }
}
