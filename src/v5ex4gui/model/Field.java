package v5ex4gui.model;

import java.util.Arrays;
import java.util.logging.FileHandler;

public class Field {
    Type[][] cells;

    public Field() {
        cells = new Type[3][3];
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                cells[i][j] = Type.NOT_SET;
            }
        }
    }

    public void show() {
        //todo к графике
        System.out.println(Arrays.deepToString(cells));
    }

    public void doShoot(Point point, Type type) {
        //todo проверки
        if (cells[point.getX()][point.getY()] == Type.NOT_SET){
            cells[point.getX()][point.getY()] = type;
        }
    }

    public enum Type {
        X, O, NOT_SET
    }
}
