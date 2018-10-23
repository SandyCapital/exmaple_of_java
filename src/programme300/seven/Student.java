package programme300.seven;

import java.lang.reflect.Field;

public class Student {
    private int id;
    private String name;
    private boolean male;
    private double account;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getMale() {
        return male;
    }

    public void setMale(Boolean male) {
        this.male = male;
    }

    public double getAccount() {
        return account;
    }

    public void setAccount(double account) {
        this.account = account;
    }

    public static void main(String[] args) {
        Student student=new Student();
        Class<?> clazz =student.getClass();
        System.out.println("类的标准名称;"+clazz.getCanonicalName());
        try {

            Field id=clazz.getDeclaredField("id");
            System.out.println("设置前的id："+student.getId());
            id.setAccessible(true);
            id.setInt(student,10);
            System.out.println("设置后的id："+student.getId());

            Field name=clazz.getDeclaredField("name");
            System.out.println("设置前的name："+student.getName());
            name.setAccessible(true);
            name.set(student,"明日科技");
            System.out.println("设置后的name"+student.getName());

            Field male=clazz.getDeclaredField("male");
            System.out.println("设置前的male："+student.getMale());
            male.setAccessible(true);
            male.setBoolean(student,true);
            System.out.println("设置后的male："+student.getMale());

            Field account=clazz.getDeclaredField("account");
            System.out.println("设置前的account："+student.getAccount());
            account.setAccessible(true);
            account.setDouble(student,12.34);
            System.out.println("设置后的account"+student.getAccount());
                   } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
