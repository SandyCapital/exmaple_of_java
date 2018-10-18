package Swing;

import javax.swing.*;

public class ModelGUI {
    public static void main(String[] args) {
        JFrame f = new JFrame("外部窗口");
        f.setSize(800,600);
        f.setLocation(100,100);

        JDialog d=new JDialog(f);
        d.setModal(true);
        d.setTitle("模态的对话框");
        d.setSize(400,300);
        d.setLocation(200, 200);
        d.setLayout(null);

        JButton b = new JButton("test");
        b.setBounds(50, 50, 280, 30);
        d.add(b);

        f.setVisible(true);
        d.setVisible(true);
    }
}
