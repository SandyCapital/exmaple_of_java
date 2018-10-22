package Swing;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class ComboBoxGUI {
    public static void main(String[] args) {
        JFrame f = new JFrame("lol");
        f.setSize(400, 300);
        f.setLayout(null);
        f.setLocation(200, 200);


        String[] names = {"王梅", "嘻嘻"};
        JComboBox jb=new JComboBox(names);

        jb.setBounds(50, 50, 80, 30);

        f.add(jb);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

        int option = JOptionPane.showConfirmDialog(f, "是否使用外挂");
        if (JOptionPane.OK_OPTION == option) {
            String answer = JOptionPane.showInputDialog(f, "输入yes，表明使用外挂后果自负");
            if ("yes".equals(answer)) {
                JOptionPane.showMessageDialog(f, "你使用外挂被抓了");
            }
        }
    }
}
