package v5ex4gui.views;

import v5ex4gui.controllers.GameWindowController;
import v5ex4gui.model.Field;
import v5ex4gui.model.Point;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameWindow extends JFrame {
    JPanel jPanel = new JPanel();
    JButton[][] buttons = new JButton[3][3];

    public void init(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(300,300);
        setTitle("XO Game");
//        setLayout(new FlowLayout()); //by default with JPanel
//        setLayout(new BorderLayout()); // by default
        jPanel.setLayout(new GridLayout(3, 3));
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                JButton jButton = new JButton();
                jButton.setText(j % 2 == 0 ? "X" : "0");
                buttons[i][j] = jButton;
                jPanel.add(jButton);

//                ActionListener actionListener = new ActionListener() {
//                    @Override
//                    public void actionPerformed(ActionEvent e) {
//                        System.out.println("Click");
//                    }
//                };
//
//                jButton.addActionListener(actionListener);

                int finalJ = j;
                int finalI = i;
                jButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String buttonText = e.getActionCommand();
                        System.out.printf("Button: %s, x:%d, y:%d\n", buttonText, finalJ, finalI);
                        GameWindowController.doShoot(new Point(finalJ, finalI));
                    }
                });
            }
        }

        add(jPanel);

        JPanel jPanelSouth = new JPanel();
        jPanelSouth.add(new JButton("Restart"));
        jPanelSouth.add(new JButton("New Game"));

        add(jPanelSouth, BorderLayout.SOUTH);

        setVisible(true);
    }
}
