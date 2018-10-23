package programme300.seven;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 查看类的成员
 */

public class ClassViewer {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> clazz = Class.forName("java.util.ArrayList");
        System.out.println("类的标准名称：" + clazz.getCanonicalName());


        Constructor[] constructors = clazz.getConstructors();  //获得该类的所有构造方法
        System.out.println("类的构造方法：");
        if (constructors.length != 0) {
            for (Constructor constructor : constructors) {
                System.out.println("\t" + constructor);  //输入构造方法
            }
        } else {
            System.out.println("\t空");
        }



        Field[] fields=clazz.getDeclaredFields();   //获得该类对象的所有非继承域
        System.out.println("类的非继承域变量：");
        if (fields.length!=0){
            for (Field field:fields){
                System.out.println("\t"+field);
            }
        }else {
            System.out.println("\t空");             //输入非继承域
        }



        Method[] methods = clazz.getDeclaredMethods();      //获得该类对象的所有非继承方法
        System.out.println("类的非继承方法：");
        if (methods.length != 0) {
            for (Method method : methods) {
                System.out.println(method);         //输出非继承方法
            }
        } else {
            System.out.println("\t空");
        }
    }
}