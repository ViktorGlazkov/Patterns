package composer.impl;

import java.util.ArrayList;
import java.util.List;

public class CompositeEquipment extends Equipment {
    private List<Equipment> equipments = new ArrayList<>();
    private static String tab = "";

    public CompositeEquipment(String name) {
        super(name);
    }

    public void add(Equipment equipment) {
        equipments.add(equipment);
    }

    public void remove(Equipment equipment) {
       equipments.remove(equipment);
    }

    @Override
    public void printInfo(String tab) {
        System.out.println(this.getName());
        String finalTabs = tab + " ";
        equipments.forEach(e -> {
            System.out.print(finalTabs);
            e.printInfo(finalTabs);
        });
    }
}
