package abstractFactory;

import abstractFactory.button.AbstractButton;
import abstractFactory.factory.AbstractFactory;
import abstractFactory.input.AbstractInput;

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
