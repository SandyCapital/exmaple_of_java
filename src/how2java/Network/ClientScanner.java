package how2java.Network;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientScanner {
    public static void main(String[] args) {

        try{
            Socket s=new Socket("127.0.0.1",8888);
            OutputStream os=s.getOutputStream();
            DataOutputStream dos=new DataOutputStream(os);

            Scanner scanner=new Scanner(System.in);
            String message=scanner.next();

            dos.writeUTF(message);
            dos.close();
            s.close();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
