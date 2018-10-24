package how2java.thread.threeways;

/*
使用继承的方式  创建对象的使用再使用start方法
如：
     KillThread killThread=new KillThread(gareen,teemo);
     killThread.start();

     KillThread killThread2 = new KillThread(bh,leesin);
     killThread2.start();

**/

public class KillThread extends Thread {
    private Hero h1;
    private Hero h2;

    public KillThread(Hero h1, Hero h2) {
        this.h1 = h1;
        this.h2 = h2;
    }

    @Override
    public void run() {
       while (!h2.isDead()){
           h1.attackHero(h2);
       }
    }
}
