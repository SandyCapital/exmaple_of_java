package programme300.six;

public class Initialization {
    private byte b;
    private short s;
    private int i;
    private long l;
    private float f;
    private double d;
    private boolean bl;
    private char c;
    private String string;

    public static void main(String[] args) {
        Initialization i=new Initialization();
        System.out.println("比特类型的初始值："+i.b);
        System.out.println("短整类型的初始值："+i.s);
        System.out.println("整型类型的初始值："+i.i);
        System.out.println("长整类型的初始值："+i.l);
        System.out.println("单精度浮点型的初始值："+i.f);
        System.out.println("双精度浮点型的初始值："+i.d);
        System.out.println("布尔类型的初始值："+i.bl);
        System.out.println("字符类型的初始值："+i.c);
        System.out.println("引用类型的初始值："+i.string);

    }


}
