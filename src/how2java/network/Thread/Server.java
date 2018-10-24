package how2java.network.Thread;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(8888);
            System.out.println("在线监听端口8888：");
            Socket s = ss.accept();

            new ReceiveThread(s).start();
            new SendThread(s).start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
