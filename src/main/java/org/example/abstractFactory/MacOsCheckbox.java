package org.example.abstractFactory;

public class MacOsCheckbox implements Checkbox{
    @Override
    public Checkbox createCheckbox() {
        return new MacOsCheckbox();
    }
}
