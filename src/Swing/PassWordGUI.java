package Swing;

import javax.swing.*;
import java.awt.*;

public class PassWordGUI {
    public static void main(String[] args) {
        JFrame f = new JFrame("lol");
        f.setSize(400, 300);
        f.setLocation(200, 200);
        f.setLayout(new FlowLayout());

        JLabel l = new JLabel("密码");


        JPasswordField pf = new JPasswordField("");
        pf.setText("&48kdh4@#");
        pf.setPreferredSize(new Dimension(80, 30));

//        char[] password=pf.getPassword();
//        String p=String.valueOf(password);
//        System.out.println(p);

        JProgressBar pb=new JProgressBar();
        pb.setMaximum(100);
        pb.setValue(20);
        pb.setStringPainted(true);


        f.add(l);
        f.add(pf);
        f.add(pb);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

    }
}
