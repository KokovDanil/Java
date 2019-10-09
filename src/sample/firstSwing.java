package sample;

import javax.swing.*;

public class firstSwing implements Runnable {
    public static void main(String[] var0) {
        SwingUtilities.invokeLater( new firstSwing());
    }

    public void run() {
        JFrame var1 = new JFrame("Hell, World");
        var1.setDefaultCloseOperation(2);
        var1.add(new JLabel("hell world"));
        var1.pack();
        var1.setVisible(true);
    }
}
