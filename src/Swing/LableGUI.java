package Swing;

import javax.swing.*;
import java.awt.*;

public class LableGUI {
    public static void main(String[] args) {
        JFrame f = new JFrame("lol");
        f.setSize(400, 300);
        f.setLocation(200, 200);
        f.setLayout(null);

        JLabel l = new JLabel("lol文字");
        l.setForeground(Color.red);
        l.setBounds(50, 50, 280, 30);

        JRadioButton r1 = new JRadioButton("魔法 拜访");
        r1.setBounds(80, 120, 80, 20);
        r1.setSelected(true);

        JRadioButton r = new JRadioButton("魔法 影戏");
        r.setBounds(80, 80, 80, 20);
        r.setSelected(true);

        ButtonGroup bg=new ButtonGroup();
        bg.add(r);
        bg.add(r1);

        f.add(l);
        f.add(r1);
        f.add(r);


        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
