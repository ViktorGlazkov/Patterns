package decorator.impl;

public class Client {
    public static void main(String[] args) {
        TextInterface text = new DecoratorColor(new DecoratorTabs(new Text("Color + Tabs")));
        text.print();

        text = new DecoratorTabs(new Text("Tabs"));
        text.print();

        text = new DecoratorColor(new Text("Color"));
        text.print();

        text = new Text("Nothing");
        text.print();
    }
}
