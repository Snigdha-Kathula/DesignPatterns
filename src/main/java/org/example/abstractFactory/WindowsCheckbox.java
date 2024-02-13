package org.example.abstractFactory;

public class WindowsCheckbox implements Checkbox{
    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
