package how2java.Swing;

import javax.swing.*;

public class JFrameGUI {
    public static void main(String[] args) {
        JFrame f=new JFrame("yes");
        f.setSize(400,300);
        f.setLocation(200,200);
        f.setLayout(null);
        JButton b=new JButton("test");
        b.setBounds(50,50,280,30);

        f.add(b);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
