package v5ex2Space2;

public class SpaceShip {
    double speed;
    double weight;
    double cargoValue;
    int maxPilotCounts;
    int size;
    String name;
    Type type;
    Pilot pilot;

    enum Type {
        HEAVY_CARGO, LIGHT_CARGO, TRANSPORT, MILITARY;
    }

    void launch(){
        System.out.println("Start!");
    }

    void landing(){
        System.out.println("landing");
    }

    void startEngine(){
        System.out.println("start engine");
    }

    void speedUp() {
        speed++;
    }

    void speedDown() {
        speed--;
    }

    void turnLeft() {

    }

    void turnRight() {

    }

    void systemCheck() {

    }

    void docking(){

    }

    void fillFuel() {

    }

    public void  setPilot(Pilot pilot){
        this.pilot = pilot;
    }
}
