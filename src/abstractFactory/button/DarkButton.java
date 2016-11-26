package abstractFactory.button;

public class DarkButton extends AbstractButton {
    @Override
    public void onClick() {
        System.out.println("\033[37m This is the dark button");
    }
}
