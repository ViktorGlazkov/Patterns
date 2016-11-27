package bridge;

import bridge.abstraction.EngineAbstraction;
import bridge.abstraction.FrontDriveEngine;
import bridge.abstraction.PosteriorDriveEngine;
import bridge.impl.LadaEngine;
import bridge.impl.MersedesEngine;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<EngineAbstraction> engines = new ArrayList<>();
        engines.add(new FrontDriveEngine(new LadaEngine()));
        engines.add(new PosteriorDriveEngine(new LadaEngine()));
        engines.add(new FrontDriveEngine(new MersedesEngine()));
        engines.add(new PosteriorDriveEngine(new MersedesEngine()));

        for(EngineAbstraction engine: engines) {
            engine.start();
            engine.run();
            engine.stop();
            System.out.println();
        }
    }
}
