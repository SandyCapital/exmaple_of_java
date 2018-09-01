package four;

import java.util.Scanner;

public class CheckLogin {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入用户名");
        String username=scanner.nextLine();
        System.out.println("请输入密码");
        String Password=scanner.nextLine();
        if (!username.equals("root")){
            System.out.println("用户名错误！！");
        }
        else if (!Password.equals("admin")){
            System.out.println("密码错误！！");
        }
        else {
            System.out.println("登录成功！！");
        }
    }
}
