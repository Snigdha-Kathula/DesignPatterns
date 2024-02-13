package org.example.abstractFactory;

public class AbstractFactory {
    private Button button;
    private Checkbox checkbox;

    public AbstractFactory(GUIFactory guiFactory) {
        this.button = guiFactory.createButton();
        this.checkbox = guiFactory.createCheckbox();
    }

}
