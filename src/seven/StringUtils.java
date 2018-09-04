package seven;


import java.lang.reflect.*;
import java.util.Date;

public class StringUtils {
    @SuppressWarnings("unchecked")
    public String toString(Object object){
        Class clazz=object.getClass();
        StringBuilder stringBuilder=new StringBuilder();
        Package packageName=clazz.getPackage();
        stringBuilder.append("包名："+packageName.getName()+"\t");
        String className=clazz.getSimpleName();
        stringBuilder.append("类名："+className+"\n");
        stringBuilder.append("公共构造方法：\n");

        Constructor[] constructors=clazz.getConstructors();
        for (Constructor constructor:constructors){
            String modifier=Modifier.toString(constructor.getModifiers());
            if (modifier.contains("public")){
                stringBuilder.append(constructor.toGenericString()+"\n");
            }
        }

        stringBuilder.append("公共域：\n");
        Field[] fields=clazz.getDeclaredFields();          //获得代表所有域的Field数组
        for (Field field:fields){
            String modifier=Modifier.toString(field.getModifiers());
            if (modifier.contains("public")){
                stringBuilder.append(field.toGenericString()+"\n");
            }
        }

        stringBuilder.append("公共方法：\n");
        Method[] methods=clazz.getDeclaredMethods();
        for (Method method:methods){
            String modifier=Modifier.toString(method.getModifiers());
            if (modifier.contains("public")){
                stringBuilder.append(method.toGenericString()+"\n");
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
       System.out.println(new StringUtils().toString(new java.util.Date()));
    }
}
