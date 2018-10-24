package how2java.swing;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutGUI {
    public static void main(String[] args) {
        JFrame f = new JFrame("lol");
        f.setSize(400,300);
        f.setLocation(200, 200);
        f.setLayout(new FlowLayout());

        JButton b = new JButton("英雄1");
        JButton b1 = new JButton("英雄2");
        JButton b2 = new JButton("英雄3");

        // 即便 使用 布局器 ，也可以 通过setPreferredSize，向布局器建议该组件显示的大小
        b2.setPreferredSize(new Dimension(180, 40));

        f.add(b);
        f.add(b1);
        f.add(b2);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
