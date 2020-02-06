package v5ex4gui.model;

public class User implements Shootable{

    public volatile static boolean isShoot = false;
    public static Point point;

    @Override
    public Point getShoot() {
        isShoot = false;
        while (!isShoot); //todo wait
        return point;
    }
}
