package org.example.adapter;

public class YesBankAdapter implements BankApi{
    YesBank yesBank = new YesBank();
    @Override
    public String transferMoney(int AccNO, int amount) {
        return yesBank.sendMoney(AccNO, amount);
    }

    @Override
    public String withdrawMoney(int amount) {
        return yesBank.getMoney(amount);
    }

    @Override
    public String addMoney(int AccNo, int amount) {
        return yesBank.insertMoney(amount);
    }
}
