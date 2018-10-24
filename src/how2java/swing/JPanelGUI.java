package how2java.swing;

import javax.swing.*;
import java.awt.*;

public class JPanelGUI {
    public static void main(String[] args) {
        JFrame f = new JFrame("lol");
        f.setSize(400, 300);
        f.setLocation(200, 200);
        f.setLayout(null);

        JPanel pl = new JPanel();
        pl.setBounds(50, 50, 300, 60);
        pl.setBackground(Color.red);

        pl.setLayout(new FlowLayout());

        JButton b1 = new JButton("英雄一");
        JButton b2 = new JButton("英雄二");
        JButton b3 = new JButton("英雄三");

        pl.add(b1);
        pl.add(b2);
        pl.add(b3);


        JPanel p2 = new JPanel();
        JButton b4 = new JButton("英雄4");
        JButton b5 = new JButton("英雄5");
        JButton b6 = new JButton("英雄6");

        p2.add(b4);
        p2.add(b5);
        p2.add(b6);

        p2.setBackground(Color.BLUE);
        p2.setBounds(10, 150, 300, 60);

        f.add(pl);
        f.add(p2);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
