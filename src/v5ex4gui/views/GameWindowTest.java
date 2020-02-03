package v5ex4gui.views;

import javax.swing.*;
import java.awt.*;

public class GameWindowTest extends JFrame {
    public void init(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(500,600);
        setTitle("XO Game");
        setLayout(new FlowLayout());

        JButton jButton = new JButton("Hello");
        add(jButton);

        JButton jButton1 = new JButton("Bye");
        add(jButton1);

        setVisible(true);
    }
}
