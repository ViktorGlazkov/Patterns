package abstractFactory.factory;

import abstractFactory.button.AbstractButton;
import abstractFactory.button.DarkButton;
import abstractFactory.input.AbstractInput;
import abstractFactory.input.DarkInput;

public class DarkThemeFactory implements AbstractFactory {
    @Override
    public AbstractButton createButton() {
        return new DarkButton();
    }

    @Override
    public AbstractInput createInput() {
        return new DarkInput();
    }
}
