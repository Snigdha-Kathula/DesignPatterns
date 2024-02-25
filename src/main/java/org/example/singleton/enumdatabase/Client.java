package org.example.singleton.enumdatabase;

public class Client {
    public static void main(String[] args) {
        DatabaseEnum databaseEnum = DatabaseEnum.DATABASE;
        databaseEnum.data("Database Singleton object created");
    }
}
//Q: Are there other ways to achieve singleton without using private constructors?
//A: Having a private constructor is to restrict the external world to instantiate the Singleton class.
//   If we can achieve the same by other means, we can achieve Singleton without using private constructors.
//   One of the ways is to use enums.