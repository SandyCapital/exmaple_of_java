package programme300.six;

/**
 * A：序列化：
 * 简单说就是为了保存在内存中的各种对象的状态（也就是实例变量，不是方法），
 * 并且可以把保存的对象状态再读出来。
 *
 * B:什么情况下需要序列化：
 * 1.当你想把的内存中的对象状态保存到一个文件中或者数据库中时候；
 * 2.当你想用套接字在网络上传送对象的时候；
 * 3.当你想通过RMI传输对象的时候；
 *
 *
 * C:当对一个对象实现序列化时，究竟发生了什么？
 * 在没有序列化前，每个保存在堆（Heap）中的对象都有相应的状态（state），即实例变量（instance variable）比如：
 */

import java.io.*;

public class EmployeeSerialize implements Serializable {
    private static final long serialVersionId=4545654664L;
    private String name;
    private int age;
    private AddressSerialize addressSerialize;

    public EmployeeSerialize(String name, int age, AddressSerialize addressSerialize) {
        this.name = name;
        this.age = age;
        this.addressSerialize = addressSerialize;
    }

    public static long getSerialVersionId() {
        return serialVersionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public AddressSerialize getAddressSerialize() {
        return addressSerialize;
    }

    public void setAddressSerialize(AddressSerialize addressSerialize) {
        this.addressSerialize = addressSerialize;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("姓名:"+name+",");
        stringBuilder.append("年龄:"+age+", ");
        stringBuilder.append("地址:"+addressSerialize);
        return stringBuilder.toString();
    }


    public static void main(String[] args) {
        System.out.println("序列化之前：");
        AddressSerialize as=new AddressSerialize("中国","湖南","株洲");
        EmployeeSerialize es=new EmployeeSerialize("刘鹏",30,as);
        System.out.println("员工1的信息");
        System.out.println(es);
        System.out.println("序列化之后：");

        //序列化的步骤
        ObjectOutputStream out=null;
        ObjectInputStream in=null;
        EmployeeSerialize esAfter=null;
        try{
            out=new ObjectOutputStream(new FileOutputStream("employee.dat"));
            out.writeObject(es);
            in=new ObjectInputStream(new FileInputStream("employee.dat"));
            esAfter= (EmployeeSerialize) in.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        if (esAfter!=null){
            esAfter.getAddressSerialize().setState("中国");
            esAfter.getAddressSerialize().setProvince("四川");
            esAfter.getAddressSerialize().setCity("成都");
            esAfter.setName("李鹏");
            esAfter.setAge(24);
            System.out.println("员工1的信息：");
            System.out.println(es);
            System.out.println("员工2的信息：");
            System.out.println(esAfter);
        }

    }
}
