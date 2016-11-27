package abstractFactory.impl.button;

public abstract class AbstractButton {
    private String text;

    public void setText(String text) {
        this.text = text;
    };

    public void onClick() {
        System.out.print(this.text);
    };
}
