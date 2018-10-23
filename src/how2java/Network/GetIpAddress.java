package how2java.Network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetIpAddress {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress host=InetAddress.getLocalHost();
        String ip=host.getHostAddress();
        System.out.println(host);
        System.out.println("本机地址："+ip);
    }
}
