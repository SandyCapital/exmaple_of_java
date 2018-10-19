package Swing;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutGUI {
    public static void main(String[] args) {
        JFrame f = new JFrame("lol");
        f.setSize(400, 300);
        f.setLocation(200, 200);
        f.setLayout(new BorderLayout());

        JButton b = new JButton("天下");
        JButton b1 = new JButton("王者");
        JButton b2 = new JButton("哈哈");
        JButton b3 = new JButton("页数");
        JButton b4 = new JButton("必备");

        f.add(b, BorderLayout.NORTH);
        f.add(b1, BorderLayout.SOUTH);
        f.add(b2, BorderLayout.WEST);
        f.add(b3, BorderLayout.EAST);
        f.add(b4, BorderLayout.CENTER);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
