package seven;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 动态改变数组的长度
 */

public class UsefulArray {
    public static Object increase(Object array){
        Class<?> clazz=array.getClass();
        if (clazz.isArray()){
            Class<?> componentType=clazz.getComponentType();
            int length= Array.getLength(array);
            //新建数组
            Object newArray=Array.newInstance(componentType,length+5);

            System.arraycopy(array,0,newArray,0,length);  //复制原来数组中的数据
            return newArray;
        }
        return null;
    }

    public static void main(String[] args) {
        int[] intArray=new int[10];
        System.out.println("整型数组的原始长度是："+intArray.length);
        Arrays.fill(intArray,8);
        System.out.println("整型数组的内容：");
        System.out.println(Arrays.toString(intArray));
        int[] newIntArray= (int[]) increase(intArray);
        System.out.println("整型数组扩展后端长度是："+newIntArray.length);
        System.out.println("整型数组的内容：");
        System.out.println(Arrays.toString(newIntArray));
    }
}
