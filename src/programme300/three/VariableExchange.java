package programme300.three;

import java.util.Scanner;

/*
两个整型类型变量的高效互换，不借助第三个变量
 */
public class VariableExchange {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入变量A的值：");
        long A=scanner.nextLong();
        System.out.println("请输入变量B的值：");
        long B=scanner.nextLong();
        System.out.println("A="+A+"\tB="+B);
        System.out.println("执行变量互换...");
        //关键是执行了异或运算
        A=A^B;
        B=B^A;
        A=A^B;
        System.out.println("A="+A+"\tB="+B);
    }
}
