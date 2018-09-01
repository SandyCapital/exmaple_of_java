package six;

import java.awt.*;

public class Cat {
    private String name;
    private int age;
    private double weight;
    private Color color;

    public Cat(String name, int age, double weight, Color color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    //重写equal方法可以比较两个对象是否相同
    @Override
    public boolean equals(Object object) {  //利用属性来判读是否相同
        if (this == object) {
                return true;
        }
        if (object == null) {   //如果两个猫咪有一个为null则不同
            return false;
        }
        if (getClass() != object.getClass()) {  //如果两个猫咪的类型不同则不同
            return false;
        }
        Cat cat = (Cat) object;
        return name.equals(cat.name) && (age == cat.age) && (weight == cat.weight) && color.equals(cat.color);
    }


    //重写toString方法可以输出对象
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("名字：" + name + "\n");
        stringBuilder.append("年龄：" + age + "\n");
        stringBuilder.append("体重：" + weight + "\n");
        stringBuilder.append("颜色：" + color + "\n");
        return stringBuilder.toString();
    }

    //重写hashcode方法可以让相同的对象保存在相同的位置
    @Override
    public int hashCode(){
        return 7*name.hashCode()+11*new Integer(age).hashCode()+13*new Double(weight)
                .hashCode()+17*color.hashCode();
    }




    public static void main(String[] args) {
        Cat cat=new Cat("java",12,21,Color.BLACK);
        Cat cat1=new Cat("java",12,21,Color.BLACK);
        Cat cat2=new Cat("java",14,21,Color.BLACK);
        System.out.println("猫咪一号的哈希值："+cat.hashCode());
        System.out.println("猫咪二号的哈希值："+cat1.hashCode());
        System.out.println("猫咪三号的哈希值："+cat2.hashCode());
        System.out.println("猫咪一号是否与猫咪二号相同："+cat.equals(cat1));
        System.out.println("猫咪一号是否与猫咪三号相同："+cat.equals(cat2));
        System.out.println("猫咪一号："+cat);
    }


}
