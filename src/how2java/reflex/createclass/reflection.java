package how2java.reflex.createclass;

import how2java.reflex.getclass.Hero;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

//通过反射机制创建一个对象

public class reflection {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.name = "lesson";
        System.out.println(hero.name);

        String heroName = "how2java.reflex.getclass.Hero";
        try {
            Class pClass = Class.forName(heroName);
            Constructor c = pClass.getConstructor();
            Hero newHero = (Hero) c.newInstance();
            newHero.name = "liu";
            System.out.println(newHero.name);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
