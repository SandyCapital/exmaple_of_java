package how2java.Swing;

import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class FileGUI {
    public static void main(String[] args) {
        JFrame f = new JFrame("lol");
        f.setSize(250, 150);
        f.setLocationRelativeTo(null);
        f.setLayout(new FlowLayout());


        //创建文件选择器
        JFileChooser fc = new JFileChooser();

        //文件过滤
        fc.setFileFilter(new FileFilter() {
            @Override
            public boolean accept(File f) {
                return f.getName().toLowerCase().endsWith(".txt");
            }

            @Override
            public String getDescription() {
                return ".txt";
            }
        });

        JButton bOpen = new JButton("打开文件");
        JButton bSave = new JButton("保存文件");

        f.add(bOpen);
        f.add(bSave);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);


        bOpen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int returnVal=fc.showOpenDialog(f);
                File file=fc.getSelectedFile();
                if (returnVal==JFileChooser.APPROVE_OPTION){
                    JOptionPane.showMessageDialog(f,"计划打开文件："+file.getAbsolutePath());
                }

            }
        });

        bSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int returnVal = fc.showSaveDialog(f);
                File file = fc.getSelectedFile();
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    JOptionPane.showMessageDialog(f,"计划保存到文件："+file.getAbsolutePath());
                }

            }
        });
    }
}
