package programme300.six;

import java.util.Scanner;

public class CelsiusConverter {
    public double getFahrenheit(double celsius){
        double fahrenheit=1.8*celsius+32;
        return fahrenheit;
    }

    public static void main(String[] args) {
        System.out.println("输入要转换的温度（单位：摄氏度）");
        Scanner scanner=new Scanner(System.in);
        double celsius=scanner.nextDouble();
        CelsiusConverter celsiusConverter=new CelsiusConverter();
        double fahrenheit=celsiusConverter.getFahrenheit(celsius);
        System.out.println("转换完成的温度（单位：华氏度）："+fahrenheit);
    }
}
