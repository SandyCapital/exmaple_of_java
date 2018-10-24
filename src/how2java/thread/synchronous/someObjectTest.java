package how2java.thread.synchronous;

import java.text.SimpleDateFormat;
import java.util.Date;

public class someObjectTest {

    public static String now() {
        return new SimpleDateFormat("HH:mm:ss").format(new Date());
    }

    public static void main(String[] args) {

        final Object someObject = new Object();

        Thread thread = new Thread() {
            public void run() {
                try {
                    System.out.println(now() + " thread 线程已经运行");
                    System.out.println(now() + this.getName() + " 试图占有对象：someObject");
                    synchronized (someObject) {

                        System.out.println(now() + this.getName() + " 占有对象：someObject");
                        Thread.sleep(5000);
                        System.out.println(now() + this.getName() + " 释放对象：someObject");
                    }
                    System.out.println(now() + " thread 线程结束");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        thread.setName(" thread");
        thread.start();

        Thread thread1 = new Thread() {

            public void run() {
                try {
                    System.out.println(now() + " thread1 线程已经运行");
                    System.out.println(now() + this.getName() + " 试图占有对象：someObject");
                    synchronized (someObject) {
                        System.out.println(now() + this.getName() + " 占有对象：someObject");
                        Thread.sleep(5000);
                        System.out.println(now() + this.getName() + " 释放对象：someObject");
                    }
                    System.out.println(now() + " thread1 线程结束");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        };
        thread1.setName(" thread1");
        thread1.start();
    }
}
