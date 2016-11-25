package decorator;

public abstract class Decorator implements TextInterface {
    protected TextInterface text;

    public Decorator(TextInterface text) {
        this.text = text;
    }

    @Override
    public void print() {
        text.print();
    }
}
