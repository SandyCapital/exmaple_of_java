package how2java.Network.GUIThread;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class ReceiveThread extends Thread {
    private Socket s;
    private JTextArea ta;

    public ReceiveThread(Socket s, JTextArea ta) {
        this.s = s;
        this.ta = ta;
    }

    @Override
    public void run() {
        while (true){
            try{
                DataInputStream dis=new DataInputStream(s.getInputStream());
                String text=dis.readUTF();
                ta.append(text+"\r\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
