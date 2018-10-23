package programme300.three;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入一个待计算的数字");
        Long number=scanner.nextLong();
        System.out.println("你输入的数字为："+number);
        System.out.println("这个数字乘以2为："+(number<<1));
        System.out.println("这个数字乘以4为："+(number<<2));
        System.out.println("这个数字乘以8为："+(number<<3));
        System.out.println("这个数字乘以16为："+(number<<4));
    }
}
