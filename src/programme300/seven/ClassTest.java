package programme300.seven;

/**
 * 1.如果一个类的对象可用，最简单的方式是使用Object.getClass();
 * 2.如果类型可用，但没有对象则可以在类型后加上.class 来获得class对象
 * 3.如果知道类的全名，则可以使用静态方法 class.forName()来获得class对象。该方法不能用在原始类型上，但是
 * 可用使用在原始类型数组上
 * 4.每一个原始类型和void都有包装类，利用其TYPE域就可以获得class对象
 */

import java.util.Date;

public class ClassTest {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("第一种方法：Object.getClass()");
        Class c1=new Date().getClass();
        System.out.println(c1.getName());
        System.out.println("第二种方法：.class语法");
        Class c2=boolean.class;
        System.out.println(c2.getName());
        System.out.println("第三种方法：class.forName()");
        Class c3=Class.forName("java.lang.String");
        System.out.println(c3.getName());
        System.out.println("第四种方法：包装类的Type域");
        Class c4=Double.TYPE;
        System.out.println(c4.getName());
    }
}
