package decorator.impl;

public class Text implements TextInterface {
    private String text;

    public Text(String str) {
        this.text = str;
    }

    @Override
    public void print() {
        System.out.println(this.text);
    }
}
