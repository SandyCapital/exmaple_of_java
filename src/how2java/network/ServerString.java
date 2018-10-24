package how2java.network;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerString {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket( 8888);
            System.out.println("监听在线端口号：8888");
            Socket s=ss.accept();

            //把输入流封装在DataInputStream
            InputStream is=s.getInputStream();
            DataInputStream dis = new DataInputStream(is);

            //使用readUTF读取字符串
            String msg=dis.readUTF();
            System.out.println(msg);
            dis.close();
            s.close();
            ss.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
