package v5ex4gui.views;

import javax.swing.*;
import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.awt.*;

public class GameWindowTest extends JFrame {
    public void init(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(500,300);
        setTitle("XO Game");
//        setLayout(new FlowLayout());
        setLayout(new BorderLayout());

        JButton jButton = new JButton("Hello");
        add(jButton, BorderLayout.CENTER);

        JButton jButton1 = new JButton("Bye");
        add(jButton1, BorderLayout.NORTH);

        add(new JButton("West"), BorderLayout.WEST);
        add(new JButton("East"), BorderLayout.EAST);
        add(new JButton("South"), BorderLayout.SOUTH);

        setVisible(true);
    }
}
