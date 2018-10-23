package how2java.Network.GUIThread;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class GUIServer {
    public static void main(String[] args) throws Exception {

        JFrame f = new JFrame();
        f.setTitle("server");

        f.setSize(400, 300);
        f.setLocation(100, 200);
        f.setLayout(null);

        JButton b = new JButton("send");
        b.setBounds(290, 205, 80, 35);
        f.add(b);

        final JTextField tf = new JTextField();
        tf.setBounds(10, 205, 270, 35);
        tf.setFont(new Font(null, Font.PLAIN, 15));
        f.add(tf);

        final JTextArea ta = new JTextArea();
        ta.setBounds(10,10, 360, 180);
//        自动换行
        ta.setLineWrap(true);
//        设置字体
        ta.setFont(new Font(null, Font.PLAIN, 15));
        ta.setEditable(false);
        f.add(ta);

        JScrollPane scrollPane=new JScrollPane(ta);
        scrollPane.setBounds(10,10,360,180);
        //打开滚动条。没有超过内容框，默认不显示滚动条
        //scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        f.add(scrollPane);


        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

        ServerSocket ss = new ServerSocket(8888);

        System.out.println("listening on port:8888");
        final Socket s =  ss.accept();
        new Thread() {
            public void run() {
                while (true) {
                    try {
                        DataInputStream dis = new DataInputStream(
                                s.getInputStream());
                        String text = dis.readUTF();
                        ta.append(" 来自客户端："+text+"\r\n");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

            }
        }.start();

        b.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                String text = tf.getText();
                tf.setText("");
                ta.append(" 服务器："+text+"\r\n");
                //文本框获得焦点
                tf.requestFocus();

                try {
                    DataOutputStream dos = new DataOutputStream(
                            s.getOutputStream());
                    dos.writeUTF(text);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

    }
}
