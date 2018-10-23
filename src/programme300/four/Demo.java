package programme300.four;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个年份：");
        Long year;
        try{
            year=scanner.nextLong();
            //判读闰年
            if (year%4==0&&year%400==0&&year%100!=0){
                System.out.println(year+"是闰年！");
            }
            else {
                System.out.println(year+"不是闰年！");
            }
        }catch (Exception e){
            System.out.println("输入的不是有效年份！");
        }
    }
}
