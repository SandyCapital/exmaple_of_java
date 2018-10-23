package how2java.Network;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ClientCommunicate {
    public static void main(String[] args) {
        try {
            Socket s=new Socket("127.0.0.1",8888);
            OutputStream os=s.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            InputStream is=s.getInputStream();
            DataInputStream dis = new DataInputStream(is);

            while(true){
                Scanner scanner=new Scanner(System.in);
                String fromClient=scanner.next();
                dos.writeUTF(fromClient);

                String fromServer=dis.readUTF();
                System.out.println("这是来自服务器的消息："+fromServer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
