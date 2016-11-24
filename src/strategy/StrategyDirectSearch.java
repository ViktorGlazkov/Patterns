package strategy;

import java.util.List;

public class StrategyDirectSearch implements Strategy {
    @Override
    public int indexOf(int value, List<Integer> values) {
        for(int i = 0; i < values.size(); i++) {
            if(values.get(i) == value) {
                return i;
            }
        }

        return -1;
    }
}
