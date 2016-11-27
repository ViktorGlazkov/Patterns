package strategy.impl;

import java.util.List;

public class Context {
    private Strategy strategy;

    public Context() {}

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int value, List<Integer> values) {
        return strategy.indexOf(value, values);
    }
}
