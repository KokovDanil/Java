package v5ex4gui.model;

public class Computer implements Shootable {
    @Override
    public Point getShoot() {
        return Point.getRandomPoint();
    }
}
