package how2java.Swing;

import javax.swing.*;
import java.awt.*;

public class TextGUI {
    public static void main(String[] args) {
        JFrame f = new JFrame("lol");
        f.setSize(400, 300);
        f.setLocation(200, 200);

        f.setLayout(new FlowLayout());

        JLabel name = new JLabel("账号:");
        JTextField nameField = new JTextField("");
        nameField.setText("请输入账号");
        nameField.setPreferredSize(new Dimension(80, 30));

        JLabel password = new JLabel("密码:");
        JTextField passField = new JTextField("");
        passField.setText("请输入密码");
        passField.setPreferredSize(new Dimension(80, 30));

        f.add(name);
        f.add(nameField);

        f.add(password);
        f.add(passField);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

    }
}
