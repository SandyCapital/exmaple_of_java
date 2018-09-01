package three;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class RedirectOutputStream {
    public static void main(String[] args) {
        try{
            PrintStream out=System.out;  //保存原来输出流
            PrintStream ps=new PrintStream("D:/log.txt"); //创建文件输出流
            System.setOut(ps);  //设置使用新的输出流
            int age=18;
            System.out.println("年龄变量定义成功，初始值位18");
            String sex="女";
            System.out.println("年龄变量定义成功，初始值位女");
            String info="这是个"+age+"岁的"+sex+"孩子";
            System.out.println("整合这两个变量为info的字符串，其结果是："+info);
            System.setOut(out);
            System.out.println("程序运行完毕，查看日志文件");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
