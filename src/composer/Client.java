package composer;

public class Client {
    public static void main(String[] args) {
        FloppyDisk floppyDisk1 = new FloppyDisk("flop1");
        FloppyDisk floppyDisk2 = new FloppyDisk("flop2");
        FloppyDisk floppyDisk3 = new FloppyDisk("flop3");
        FloppyDisk floppyDisk4 = new FloppyDisk("flop4");

        CompositeEquipment equipment = new CompositeEquipment("CE");
        equipment.add(floppyDisk1);
        equipment.add(floppyDisk2);
        equipment.add(floppyDisk3);
        equipment.add(floppyDisk4);

        CompositeEquipment equipment2 = new CompositeEquipment("CE2");
        equipment2.add(floppyDisk1);
        equipment2.add(floppyDisk2);
        equipment2.add(floppyDisk3);
        equipment2.add(floppyDisk4);

        equipment.remove(floppyDisk2);

        equipment.add(equipment2);

        equipment.add(floppyDisk1);
        equipment.add(floppyDisk2);

        equipment.printInfo();
    }
}
