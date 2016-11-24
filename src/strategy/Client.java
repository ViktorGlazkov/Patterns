package strategy;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(4);
        values.add(3);
        values.add(6);
        values.add(7);
        values.add(2);
        values.add(2);
        values.add(8);

        Context context = new Context();
        context.setStrategy(new StrategyDirectSearch());
        System.out.println(context.executeStrategy(7, values));

        context.setStrategy(new StrategyBinarySearch());
        System.out.println(context.executeStrategy(7, values));
    }
}
