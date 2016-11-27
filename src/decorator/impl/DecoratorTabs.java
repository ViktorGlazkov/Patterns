package decorator.impl;

public class DecoratorTabs extends Decorator {
    public DecoratorTabs(TextInterface text) {
        super(text);
    }

    @Override
    public void print() {
        System.out.print("\t\t\t\t");
        super.print();
    }
}
