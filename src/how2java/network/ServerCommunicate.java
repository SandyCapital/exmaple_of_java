package how2java.network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerCommunicate {
    public static void main(String[] args) {
        try{
            ServerSocket ss = new ServerSocket(8888);
            System.out.println("在线监听端口8888：");
            Socket s=ss.accept();

            InputStream is=s.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            OutputStream os=s.getOutputStream();
            DataOutputStream dos=new DataOutputStream(os);

            while (true){
                String fromClient=dis.readUTF();
                System.out.println("这是来自客户端的消息："+fromClient);

                Scanner scanner=new Scanner(System.in);
                String message=scanner.next();
                dos.writeUTF(message);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
