package abstractFactory.impl.factory;

import abstractFactory.impl.button.AbstractButton;
import abstractFactory.impl.button.DarkButton;
import abstractFactory.impl.input.AbstractInput;
import abstractFactory.impl.input.DarkInput;

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
