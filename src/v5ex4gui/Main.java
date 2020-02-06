package v5ex4gui;

import v5ex4gui.model.MainGame;
import v5ex4gui.views.GameWindow;
import v5ex4gui.views.GameWindowTest;

public class Main {
    public static void main(String[] args) {
//        GameWindowTest gameWindowTest = new GameWindowTest();
//        gameWindowTest.init();
        GameWindow gameWindow = new GameWindow();
        gameWindow.init();

        MainGame.start();
    }
}
