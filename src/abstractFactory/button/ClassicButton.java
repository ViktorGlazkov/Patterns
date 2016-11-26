package abstractFactory.button;

public class ClassicButton extends AbstractButton {
    @Override
    public void onClick() {
        System.out.println("This is the classic button");
    }
}
