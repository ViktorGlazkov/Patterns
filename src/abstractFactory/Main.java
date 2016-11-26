package abstractFactory;

import abstractFactory.factory.ClassicThemeFactory;
import abstractFactory.factory.DarkThemeFactory;

public class Main {
    public static void main(String[] args) {
        Client client = new Client(new ClassicThemeFactory());
        client.execute();

        client = new Client(new DarkThemeFactory());
        client.execute();
    }
}
