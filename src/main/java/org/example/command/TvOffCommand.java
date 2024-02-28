package org.example.command;

public class TvOffCommand implements Command{
    private Television tv ;

    public TvOffCommand(Television tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOff();
    }
}
