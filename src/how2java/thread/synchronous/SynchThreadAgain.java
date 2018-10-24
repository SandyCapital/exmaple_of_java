package how2java.thread.synchronous;

/*
既然任意对象都可以用来作为同步对象，而所有的线程访问的都是同一个hero对象，
索性就使用gareen来作为同步对象
进一步的，对于Hero的hurt方法，加上：
synchronized (this) {
}
表示当期对象为同步对象，即也是gareen为同步对象
* */

public class SynchThreadAgain {

    public static void main(String[] args) {

//        final Object someObject = new Object();

        final Hero gareen = new Hero();
        gareen.name = "盖伦";
        gareen.hp = 10000;

        int n = 10000;

        Thread[] addThreads = new Thread[n];
        Thread[] reduceThreads = new Thread[n];

        for (int i = 0; i < n; i++) {
            Thread thread = new Thread() {
                public void run() {

//                    任何线程要修改hp的值，必须先占用someObject
//                    synchronized (someObject) {


//                    synchronized (gareen) {
//                        gareen.recover();
//                    }

                    //recover自带synchronized
                    gareen.recover();

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };
            thread.start();
            addThreads[i] = thread;

        }
        for (int i = 0; i < n; i++) {
            Thread thread = new Thread() {
                public void run() {
//                    synchronized (someObject) {

//                    synchronized (gareen) {
//                        gareen.hurt();
//                    }
                    gareen.hurt();
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };
            thread.start();
            reduceThreads[i] = thread;
        }

        for (Thread t : addThreads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (Thread t : reduceThreads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.printf("%d个增加线程和%d个减少线程结束后%n盖伦的血量是 %.0f%n", n, n, gareen.hp);
    }
}
