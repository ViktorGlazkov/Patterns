package bridge.abstraction;

import bridge.impl.EngineImpl;

public class PosteriorDriveEngine extends EngineAbstraction {
    public PosteriorDriveEngine(EngineImpl engine) {
        super(engine);
    }

    @Override
    public void run() {
        System.out.println("-posterior drive is run");
    }
}
