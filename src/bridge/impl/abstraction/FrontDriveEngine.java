package bridge.impl.abstraction;

import bridge.impl.impl.EngineImpl;

public class FrontDriveEngine extends EngineAbstraction {
    public FrontDriveEngine(EngineImpl engine) {
        super(engine);
    }

    @Override
    public void run() {
        System.out.println("-front drive is running");
    }
}
