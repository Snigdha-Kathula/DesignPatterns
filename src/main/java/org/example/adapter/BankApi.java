package org.example.adapter;

public interface BankApi {
    String transferMoney(int AccNO, int amount);
    String withdrawMoney(int amount);
    String addMoney(int AccNo, int amount);
}
