package abstractFactory.factory;

import abstractFactory.button.AbstractButton;
import abstractFactory.input.AbstractInput;

public interface AbstractFactory {
    AbstractButton createButton();
    AbstractInput createInput();
}
