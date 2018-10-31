package how2java.reflex.accessmethods;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class reflection {
    public static void main(String[] args) {
        Hero hero = new Hero();
               hero.name = "lesson";

        try{
            Method m = hero.getClass().getMethod("setName", String.class);
            m.invoke(hero, "liu");
            System.out.println(hero.name);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
