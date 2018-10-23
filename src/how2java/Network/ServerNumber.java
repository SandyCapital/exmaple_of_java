package how2java.Network;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerNumber {
    public static void main(String[] args) {
        try{
            ServerSocket ss = new ServerSocket(8888);
            System.out.println("监听在端口号：8080");
            Socket s=ss.accept();

            //打开输出流
            InputStream is=s.getInputStream();

            //读取客户端发送的数据
            int msg=is.read();
            System.out.println(msg);
            is.close();

            s.close();
            ss.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
