package composer.impl;

import java.math.BigDecimal;

public abstract class Equipment {
    private String name;

    public Equipment(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void printInfo() {
        ;this.printInfo("");
    }

    protected void printInfo(String tab) {
        System.out.println(this.name);
    }
}
