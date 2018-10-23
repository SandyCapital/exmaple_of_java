package programme300.three;

import java.util.Scanner;

public class inputCode {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("请输入你的身份证号");
        String line=scanner.nextLine();
        System.out.println("原来你的身份证是"+line.length()+"位数字");
    }
}
