package org.example.abstractFactory;

public class WindowsButton implements Button {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
