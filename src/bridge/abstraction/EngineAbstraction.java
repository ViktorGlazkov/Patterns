package bridge.abstraction;

import bridge.impl.EngineImpl;

public abstract class EngineAbstraction {
    protected EngineImpl engine;

    public EngineAbstraction(EngineImpl engine) {
        this.engine = engine;
    }

    public void start() {
        this.engine.startEngine();
    }

    public void stop() {
        this.engine.stopEngine();
    }

    public void run() {};
}
