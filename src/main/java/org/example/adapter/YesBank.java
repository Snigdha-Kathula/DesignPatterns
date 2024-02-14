package org.example.adapter;

public class YesBank {
    public String sendMoney(int accNo, int amount){
        return "Amount has been sent successfully";
    }
    public String getMoney( int amount){
        return "Amount has been received successfully";
    }
    public String insertMoney(int amount){
        return "Amount has been inserted successfully";
    }
}
