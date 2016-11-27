package abstractFactory.impl.factory;

import abstractFactory.impl.button.AbstractButton;
import abstractFactory.impl.button.ClassicButton;
import abstractFactory.impl.input.AbstractInput;
import abstractFactory.impl.input.ClassicInput;

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
