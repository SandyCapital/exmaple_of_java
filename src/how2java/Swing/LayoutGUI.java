package how2java.Swing;

import javax.swing.*;

public class LayoutGUI {
    public static void main(String[] args) {
        JFrame f = new JFrame("lol");
        f.setSize(400, 300);
        f.setLocation(200, 200);
        f.setLayout(null);

        JButton b = new JButton("英雄1");
        b.setBounds(50, 50, 80, 30);

        JButton b1 = new JButton("英雄2");
        b1.setBounds(150, 50, 80, 30);

        f.add(b);
        f.add(b1);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
