package v5ex2Space2;

public class SpacePort {
    String name;
    int maxShip;
    SpaceShip spaceShip;
    Staff[] staffs;
    Hangar hangar; // TODO
    LunchField lunchField; // TODO
    MissionControlCenter missionControlCenter;

    void initWithSpaceship(SpaceShip spaceShip) {
        this.spaceShip = spaceShip;
        missionControlCenter.currentspaceShip = spaceShip;
    }

    void launch() {
        missionControlCenter.launch();
    }

    void initShip(){

    }

    void repair() {

    }

    void getStaff(Staff staff){

    }

}
