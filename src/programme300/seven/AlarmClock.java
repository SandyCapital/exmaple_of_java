package programme300.seven;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;


public class AlarmClock {
    private int delay;
    private boolean flag;

    public AlarmClock(int delay, boolean flag) {
        this.delay = delay;
        this.flag = flag;
    }
    public void start(){
        //java可以将类定义在方法的内部，成为局部内部类，不能用public和private修饰
        //这个类的作用域被限定在这个方法中
        //可以访问方法参数
        class Printer implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {
                SimpleDateFormat format=new SimpleDateFormat("k:m:s");
                String result=format.format(new Date());
                System.out.println("当前时间是："+result);
                if (flag){
                    Toolkit.getDefaultToolkit().beep();
                }
            }
        }
        new Timer(delay,new Printer()).start();
    }



    public static void main(String[] args) {
        AlarmClock clock=new AlarmClock(1000,true);
        clock.start();
        JOptionPane.showMessageDialog(null,"是否退出？");
        System.exit(0);
    }
}
