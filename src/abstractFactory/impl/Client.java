package abstractFactory.impl;

import abstractFactory.impl.button.AbstractButton;
import abstractFactory.impl.factory.AbstractFactory;
import abstractFactory.impl.input.AbstractInput;

public class Client {
    private AbstractButton abstractButton;
    private AbstractInput abstractInput;

    public Client(AbstractFactory abstractFactory) {
        abstractButton = abstractFactory.createButton();
        abstractInput = abstractFactory.createInput();
    }

    public void execute() {
        abstractButton.onClick();
        abstractInput.printValue();
    }
}
