package Space;

public class SpacshipFactory {
    Staff[] staffs;
    SpaceShip spaceShip;

    SpaceShip createShip(SpaceShip.Type type){
        spaceShip = new SpaceShip();
        spaceShip.type = type;
        switch (type){
            case MILITARY:
                break;
            case TRANSPORT:
                spaceShip.size = 500;
                break;
            case HEAVY_CARGO:
                spaceShip.size = 1000;
                break;
            case LIGHT_CARGO:
                spaceShip.size = 100;
                break;
            default:
                System.out.println("Don't know about this ship class");
        }
        return spaceShip;
    }
}
