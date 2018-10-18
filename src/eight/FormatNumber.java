package eight;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class FormatNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个数字");
        double number=scanner.nextDouble();
        System.out.println("该数字用Locale类的常量作为格式化对象的构造函数，将获得的");
        NumberFormat format=NumberFormat.getCurrencyInstance(Locale.CHINA);
        System.out.println("Locale.CHINA: "+format.format(number));
        format=NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("Locale.US: "+format.format(number));
        format=NumberFormat.getCurrencyInstance(Locale.ENGLISH);
        System.out.println("Locale.ENGLISH: "+format.format(number));
        format=NumberFormat.getCurrencyInstance(Locale.TAIWAN);
        System.out.println("Locale.TAIWAN: "+format.format(number));
    }
}
