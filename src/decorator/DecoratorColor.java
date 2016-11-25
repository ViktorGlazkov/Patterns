package decorator;

public class DecoratorColor extends Decorator {
    public DecoratorColor(TextInterface text) {
        super(text);
    }

    @Override
    public void print() {
        System.out.print("\033[36m");
        super.print();
        System.out.print("\033[37m");
    }
}
