package how2java.thread.threeways;
/*
创建类Battle，实现Runnable接口:

     Battle battle1 = new Battle(gareen,teemo);
     new thread(battle1).start();
**/

public class Battle implements Runnable {

    private Hero h1;
    private Hero h2;

    public Battle(Hero h1, Hero h2) {
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
