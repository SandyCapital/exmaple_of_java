package how2java.Swing;

import javax.swing.*;

public class JDialogGUI {
    public static void main(String[] args) {
        JDialog j=new JDialog();
        j.setTitle("lol");
        j.setSize(400, 300);
        j.setLocation(200, 200);
        j.setLayout(null);
        JButton b = new JButton("test");
        b.setBounds(50, 50, 280, 30);

        j.add(b);
        j.setVisible(true);
    }
}
