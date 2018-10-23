package how2java.Swing;

import javax.swing.*;
import java.awt.*;

public class GirdLayoutGUI {
    public static void main(String[] args) {
        JFrame f = new JFrame("lol");
        f.setSize(400, 300);
        f.setLayout(new GridLayout(2, 3));
        f.setLocation(200, 200);

        JButton b = new JButton("英雄");
        JButton b1 = new JButton("宏碁");
        JButton b2 = new JButton("宏碁");
        JButton b3 = new JButton("哈哈");
        JButton b4 = new JButton("密码");

        f.add(b);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
