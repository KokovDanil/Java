package v5ex2Space2;

import static v5ex2Space2.SpaceShip.Type.HEAVY_CARGO;
import static v5ex2Space2.SpaceShip.Type.LIGHT_CARGO;

public class Game {
    SpacePort baikonur;
    private static Game instance;

    public static Game getInstance() {
        if (instance == null){
            return new Game();
        }
        return instance;
    }

    private Game(){

    }

    void init() {
        baikonur = new SpacePort();
        Pilot pilot = new Pilot("Jurii");
        SpacshipFactory spacshipFactory = new SpacshipFactory();
        SpaceShip spaceShip = spacshipFactory.createShip(LIGHT_CARGO);
        SpaceShip spaceShip2 = spacshipFactory.createShip(HEAVY_CARGO);
        MissionControlCenter mcc = new MissionControlCenter();

        spaceShip.setPilot(pilot);
        baikonur.missionControlCenter = mcc;
        baikonur.initWithSpaceship(spaceShip);
    }

    void start() {
        baikonur.launch();
    }
}
