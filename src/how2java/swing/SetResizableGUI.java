package how2java.swing;

import javax.swing.*;

public class SetResizableGUI {
    public static void main(String[] args) {
        JFrame f=new JFrame("test");
        f.setSize(400,300);
        f.setLocation(200, 200);
        f.setLayout(null);

        JButton b=new JButton("test");
        b.setBounds(50,50,280,30);

        f.add(b);

        //窗口大小不可变化
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
