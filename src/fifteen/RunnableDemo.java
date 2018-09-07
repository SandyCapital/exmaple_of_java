package fifteen;



public class RunnableDemo implements Runnable{
    private Thread t;
    private String threadName;

    RunnableDemo(String name){
        threadName=name;
        System.out.println("creating "+threadName);
    }

    @Override
    public void run() {
        System.out.println("running "+threadName);
        try{
            for (int i=4;i>0;i--){
                System.out.println("Thread:"+threadName+","+i);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread:"+threadName+" interrupt.");
        }
        System.out.println("Thread:"+threadName+" exiting");
    }

    public void start(){
        System.out.println("starting "+threadName);
        if (t==null){
            t=new Thread(this,threadName);
            t.start();
        }
    }

    public static void main(String[] args) {
        RunnableDemo runnableDemo=new RunnableDemo("Thread-1");
        runnableDemo.start();

        RunnableDemo runnableDemo1=new RunnableDemo("Thread-2");
        runnableDemo1.start();
    }

}
