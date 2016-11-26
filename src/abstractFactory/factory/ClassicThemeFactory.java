package abstractFactory.factory;

import abstractFactory.button.AbstractButton;
import abstractFactory.button.ClassicButton;
import abstractFactory.input.AbstractInput;
import abstractFactory.input.ClassicInput;

public class ClassicThemeFactory implements AbstractFactory {
    @Override
    public AbstractButton createButton() {
        return new ClassicButton();
    }

    @Override
    public AbstractInput createInput() {
        return new ClassicInput();
    }
}
