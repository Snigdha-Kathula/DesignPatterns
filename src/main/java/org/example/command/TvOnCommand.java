package org.example.command;

public class TvOnCommand implements Command{
    private Television tv;

    public TvOnCommand(Television tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOn();
    }
}
