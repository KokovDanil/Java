package v5ex4gui.controllers;

import v5ex4gui.model.Point;
import v5ex4gui.model.User;

public class GameWindowController {
    public static void doShoot(Point point) {
        User.point = point;
        User.isShoot = true;
    }
}
