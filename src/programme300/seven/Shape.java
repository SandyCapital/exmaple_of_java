package programme300.seven;

/**
 * 抽象类是不能直接实例化的，如果要获得该类的实例可以使用静态方法
 * 创建实现类对象
 */

public abstract class Shape {

    //获得图形的名称  使用反射机制来获取类名称
    public String getName(){
        return this.getClass().getSimpleName();
    }

     public abstract double getArea();
}
