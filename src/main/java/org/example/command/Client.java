package org.example.command;

public class Client {
    public static void main(String[] args) {
        Television tv = new Television();

        Command tvOn = new TvOnCommand(tv);
        Command tvOff = new TvOffCommand(tv);

        RemoteControl remote = new RemoteControl();

        remote.setCommand(tvOn);
        remote.pressButton();

        remote.setCommand(tvOff);
        remote.pressButton();
    }
}
