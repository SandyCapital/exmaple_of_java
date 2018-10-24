package how2java.thread.threadways;

import how2java.thread.threeways.Hero;

//匿名类中用到外部的局部变量teemo，必须把teemo声明为final
//但是在JDK7以后，就不是必须加final的了

public class joinThread {
    public static void main(String[] args) {
        final Hero gareen = new Hero();
        gareen.name = "盖伦";
        gareen.hp = 616;
        gareen.damage = 50;

        final Hero teemo = new Hero();
        teemo.name = "提莫";
        teemo.hp = 300;
        teemo.damage = 30;

        final Hero bh = new Hero();
        bh.name = "赏金猎人";
        bh.hp = 500;
        bh.damage = 65;

        final Hero leesin = new Hero();
        leesin.name = "盲僧";
        leesin.hp = 455;
        leesin.damage = 80;

        Thread thread=new Thread(){
            public void run(){
                while (!teemo.isDead()){
                    gareen.attackHero(teemo);
                }
            }
        };

        thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread thread1=new Thread(){
            public void run(){
                while (!leesin.isDead()){
                    bh.attackHero(leesin);
                }
            }
        };

        thread1.start();
    }
}
