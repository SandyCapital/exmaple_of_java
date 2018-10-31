package how2java.reflex.accessattributes;

import java.lang.reflect.Field;

/*
getField和getDeclaredField的区别
        这两个方法都是用于获取字段
        getField 只能获取public的，包括从父类继承来的字段。
        getDeclaredField 可以获取本类所有的字段，包括private的，但是不能获取继承来的字段。
        (注： 这里只能获取到private的字段，但并不能访问该private字段的值,除非加上setAccessible(true))
*/

public class reflection {
    public static void main(String[] args) {
        Hero hero=new Hero();
        hero.name = "lesson";

        try {
            Field f = hero.getClass().getDeclaredField("name");
            f.set(hero,"liu");
            System.out.println(hero.name);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
