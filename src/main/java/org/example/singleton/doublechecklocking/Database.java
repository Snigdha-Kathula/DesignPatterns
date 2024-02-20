package org.example.singleton.doublechecklocking;

public class Database {
    private static Database instance =null;

    private Database() {
    }
    public static Database getInstance(){
        if(instance == null){
            synchronized (Database.class){
                if(instance == null){
                    instance= new Database();
                }
            }
        }
        return instance;
    }
}
//Singleton:Singleton is a Creational Design Pattern:-
// define a class that has only one instance and provides a global point of access to it.
//Advantage of Singleton design pattern :-
//Saves memory because object is not created at each request. Only single instance is reused again and again.
//Usage of Singleton design pattern;-
//Singleton pattern is mostly used in multithreaded and database applications. It is used in logging, caching, thread pools, configuration settings etc.
// Early Initialization :- an object created at the time of class loading.
// Lazy Initialization :- an object created at the time of request time.

