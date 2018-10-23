package programme300.seven;

class Outer{
    private int id;
    int x;

    //普通内部类
    class Inner{
        public void fun1(){
            fun3();
            System.out.println(x);
            System.out.println(y);
            System.out.println(id);
        }
        final static int a=2;
    }
    static int y;
    static void fun3(){
        System.out.println("这是外部类的静态方法：fun3（）");
    }


    //静态内部类
    static class Inner1{
        static{

        }
        public void fun1(){
//            System.out.println(x);
            System.out.println(y);
        }
        public static void fun2(){

        }
    }


    //匿名内部类
    Person person=new Person() {


        @Override
        public void work() {
            System.out.println("这是一个匿名内部的work方法");
        }
    };
    public void fun1(){
        Thread thread=new Thread(new Runnable() {


            @Override
            public void run() {
                System.out.println("这是一个匿名内部的run方法");
            }
        });
    }

}

