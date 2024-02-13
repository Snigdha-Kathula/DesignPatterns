package org.example.abstractFactory;

public class MacOsButton implements Button {

    @Override
    public Button createButton() {
        return new MacOsButton();
    }
}
