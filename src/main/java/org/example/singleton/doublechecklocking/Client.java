package org.example.singleton.doublechecklocking;

public class Client {
    public static void main(String[] args) {

        Database db = Database.getInstance();
    }
}
