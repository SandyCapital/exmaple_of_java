package seven;

/**
 * 普通内部类可以访问其外部类的各种类型成员，但是静态内部类只能访问静态成员
 * 普通内部类里面不能定义各种静态的成员（包括静态变量、静态方法、静态代码块和静态内部类），而静态内部类中则可以；
 * 静态变量和静态方法会出现这个语法错误(static methods can only be declared in a static or top level type)意思就是static方法只能在静态或者顶级类型（顶级类型应该就是外部类中）中声明，当然static变量和static内部类也是一样的道理。原因在静态变量和静态方法都只需要通过类名就能访问，不必通过任何实例化对象；而普通内部类的初始化要利用外部类的实例化对象，这明显违背了static的设计初衷。
 * 静态代码块会出现这个语法错误(Cannot define static initializer in inner type Outer.Inner)意思是不能在内部类中定义静态的初始化程序。
 * 原因跟以上的差不多，static声明的成员只能为类所共有，而不能仅属于一个实例化对象，通俗点来说就是不管有多少层的引用，都只能是类来引用而不能是对象。
 */

public class InnerTest {
    public static void main(String[] args) {
        //普通内部类实例化
        Outer.Inner inner=new Outer().new Inner();
        inner.fun1();

        //静态内部类实例化
        Outer.Inner1 inner1=new Outer.Inner1();
        inner1.fun1();
    }
}
