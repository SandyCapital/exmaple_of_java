package Swing;

import javax.swing.*;

public class ContentPaneGUI {
    public static void main(String[] args) {
        JFrame f = new JFrame("lol");
        f.setSize(400, 300);
        f.setLocation(200, 200);
        f.setLayout(null);


        JButton b = new JButton("test");
        b.setBounds(50, 50, 280, 30);

        f.add(b);

        f.getContentPane().add(b);

        System.out.println(b.getParent());

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
