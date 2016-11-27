package bridge.impl.impl;

public class LadaEngine implements EngineImpl {
    @Override
    public void startEngine() {
        System.out.println("Start Lada engine");
        startCarbureEngine();
    }

    @Override
    public void stopEngine() {
        System.out.println("Stop Lada engine");
        stopCarbureEngine();
    }

    private void startCarbureEngine() {
        System.out.println("-ron-don-don");
    }

    private void stopCarbureEngine() {
        System.out.println("-but we still don't start.");
    }
}


