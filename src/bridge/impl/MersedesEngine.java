package bridge.impl;

public class MersedesEngine implements EngineImpl {
    @Override
    public void startEngine() {
        System.out.println("Start Mersedes engine");
        startInjectorEngine();
    }

    @Override
    public void stopEngine() {
        System.out.println("Stop Mersedes engine");
        stopInjectorEngine();
    }

    private void startInjectorEngine() {
        System.out.println("-start to add the fuel");
    }

    private void stopInjectorEngine() {
        System.out.println("-stop to add the fuel\n-whereLada?");
    }
}


