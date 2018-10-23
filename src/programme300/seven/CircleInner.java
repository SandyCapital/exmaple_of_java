package programme300.seven;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaSymbols;

/**
 * 成员内部类
 *
 * 这样看起来，类Draw像是类Circle的一个成员，
 * CircleInner称为外部类。成员内部类可以无条件访问外部类的
 * 所有成员属性和成员方法（包括private成员和静态成员）。
 *
 *
 * 注意：
 * 不过要注意的是，当成员内部类拥有和外部类同名的成员变量或者方法时，
 * 会发生隐藏现象，即默认情况下访问的是成员内部类的成员。
 * 如果要访问外部类的同名成员，需要以下面的形式进行访问：
 * 1.外部类.this.成员变量
 * 2.外部类.this.成员方法
 *
 * 虽然成员内部类可以无条件地访问外部类的成员，而外部类想访问成员内部类的成员却不是这么随心所欲了。
 * 在外部类中如果要访问成员内部类的成员，必须先创建一个成员内部类的对象，再通过指向这个对象的引用来访问：
 */

public class CircleInner {

    public double radius=0;
    public static int count=1;

    public CircleInner(double radius){
        this.radius=radius;
        getDrawInstance().draw();   //必须先创建成员内部类的对象，再进行访问

    }

    private Draw getDrawInstance() {
        return new Draw();
    }

    class Draw{   //内部类
        public void draw(){
            System.out.println(radius);  //外部类的private成员
            System.out.println(count);   //外部类的静态成员
        }
    }

}
