package abstractFactory.impl.factory;

import abstractFactory.impl.button.AbstractButton;
import abstractFactory.impl.input.AbstractInput;

public interface AbstractFactory {
    AbstractButton createButton();
    AbstractInput createInput();
}
