package strategy;

import java.util.Collections;
import java.util.List;

public class StrategyBinarySearch implements Strategy {
    private static int index = 0;

    @Override
    public int indexOf(int value, List<Integer> values) {
        Collections.sort(values);
        return findIndex(value, values);
    }

    private int findIndex(int value, List<Integer> values) {
        int iterator = values.size() / 2;
        index += iterator;

        if (values.get(iterator) > value) {
            return findIndex(value, values.subList(0, iterator));
        } else if (values.get(iterator) < value) {
            return findIndex(value, values.subList(iterator, values.size()));
        } else {
            return index;
        }
    }
}
