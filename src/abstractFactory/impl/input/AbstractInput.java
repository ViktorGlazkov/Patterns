package abstractFactory.impl.input;

public abstract class AbstractInput {
    private String value;

    public void setValue(String text) {
        this.value = value;
    };

    public void printValue() {
        System.out.println(this.value);
    };

    public String getValue() {
        return this.value;
    };
}
