package org.example.adapter;

public interface PhonePay {
    BankApi bankApi = new YesBankAdapter();

}
//Because of using common Api called BankApi,
//now it will easy to change in one line of code
