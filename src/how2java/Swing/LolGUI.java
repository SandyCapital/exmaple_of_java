package how2java.Swing;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class LolGUI {
    public static void main(String[] args) {

        JFrame f=new JFrame("LOL");
        f.setSize(400,350);
        f.setLocation(580,200);
        f.setLayout(null);

        final JLabel l=new JLabel();

        ImageIcon i=new ImageIcon("E:\\project\\JavaExample\\a.jpg");
        l.setIcon(i);
        l.setBounds(100,30,i.getIconWidth(),i.getIconHeight());

        f.add(l);

        l.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

                Random r=new Random();
                int x=r.nextInt(f.getWidth()-l.getWidth());
                int y=r.nextInt(f.getHeight()-l.getHeight());

                l.setLocation(x,y);

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        f.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode()==39){
                    l.setLocation(l.getX()+10,l.getY());
                }
                if (e.getKeyCode()==37){
                    l.setLocation(l.getX()-10,l.getY());
                }
                if (e.getKeyCode()==38){
                    l.setLocation(l.getX(),l.getY()-10);
                }
                if (e.getKeyCode()==40){
                    l.setLocation(l.getX(),l.getY()+10);
                }
            }
        });


        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
