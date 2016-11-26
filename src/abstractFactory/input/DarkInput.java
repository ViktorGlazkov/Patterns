package abstractFactory.input;

public class DarkInput extends AbstractInput {
    @Override
    public void printValue() {
        System.out.println("\033[37m This is the dark button");
    }
}
