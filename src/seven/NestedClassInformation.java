package seven;


import java.lang.reflect.Modifier;
import java.lang.reflect.Type;

/**
 * 查看内部类的信息
 */

public class NestedClassInformation {


    public static void main(String[] args) throws ClassNotFoundException {
     Class<?> cls= Class.forName("java.awt.geom.Point2D") ;
     Class<?>[] classes=cls.getDeclaredClasses();   //获得代表内部类的Class对象组成的数组
     for (Class<?> clazz:classes){
         System.out.println("类的标准名称："+clazz.getCanonicalName());
         System.out.println("类的修饰类："+Modifier.toString(clazz.getModifiers()));
         Type[] interfaces=clazz.getGenericInterfaces();
         System.out.println("类所实现的接口：");
         if (interfaces.length!=0){
             for (Type type:interfaces){
                 System.out.println("\t"+type);
             }
         }else {
             System.out.println("\t"+"空");
         }

         Type supperClass=clazz.getGenericSuperclass();  //获得直接父类
         System.out.print("类的直接继承类：");
         if (supperClass!=null){
             System.out.println(supperClass);
         }else {
             System.out.println("空");
         }
     }
    }
}
