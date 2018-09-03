package seven;



import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class MethodTest {
    public static void main(String[] args) {
        try{
            System.out.println("调用Math类的静态方法sin（）");
            Method sin=Math.class.getDeclaredMethod("sin",Double.TYPE);
            Double sin1= (Double) sin.invoke(null,new Integer(1));
            System.out.println("1的正弦值："+sin1);

            System.out.println();

            System.out.println("调用String类的非静态方法equals（）");
            Method equals=String.class.getDeclaredMethod("equals", Object.class);
            Boolean mrsoft= (Boolean) equals.invoke(new String("明日科技"),"明日科技");
            System.out.println("字符串是否是明日科技："+mrsoft);


        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
