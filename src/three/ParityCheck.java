package three;

import java.util.Scanner;

public class ParityCheck {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个数字");
        Long number=scanner.nextLong();
        String check=(number%2==0)?"这个数是偶数":"这个数是奇数";
        System.out.println(check);
    }
}
