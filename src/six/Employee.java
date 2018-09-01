package six;

/**并不是本节的内容
 * java对象的假克隆
 *
 * employee和employeeAfter两个引用变量同时指向一个对象，
 * 当修改employeeAfter的域时，employee的域也被修改，因此是假克隆。
 *
 *提供克隆功能的类需要实现Cloneable接口，否则回报CloneNotSupportException
 */

public class Employee implements Cloneable  {
    private String name;
    private int age;
    private Address address;

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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Employee(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("姓名："+name+"\n");
        stringBuilder.append("年龄："+age+"\n");
        stringBuilder.append("地址："+address+"\n");
        return stringBuilder.toString();
    }

    /**
     * 通常需要改写该方法并把访问权限限定为public，该方法对于类中的每个域，
     * 如果只包含基本类型和不可变的引用类型，如string,或者对象在其生命周期内不可变化，
     * 则可以用浅克隆来复制对象。
     * @return
     */

//      @Override
//    public Employee clone(){    //实现浅克隆
//        Employee employee=null;
//        try{
//            employee= (Employee) super.clone();
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
//        return employee;
//   }

    @Override
    public Employee clone(){
        Employee employee=null;
        try{
            employee= (Employee) super.clone();
            employee.address=address.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return employee;
    }

    /**
     * 我们发现，employee类中又包含了Address类address的引用，
     * 我们知道，clone方法默认的是浅克隆，即不会克隆对象引用的对象，而只是简单地复制这个引用。
     * 所以在上例中，address对象在内存中只有一个，employee和employeeAfter都指向它，任何一个对象对它的修改都会影响另一个对象。
     * 所以address的值也被修改了。
     */

//    public static void main(String[] args) {
//        System.out.println("克隆之前：");
//        Address address=new Address("中国","湖南","株洲");
//        Employee employee=new Employee("刘鹏",20,address);
//        System.out.println("员工一的信息：");
//        System.out.println(employee);
//        System.out.println("克隆之后：");
//        Employee employeeAfter=employee.clone();
//        employeeAfter.getAddress().setProvinces("四川");
//        employeeAfter.getAddress().setCity("成都");
//        employeeAfter.setName("李鹏");
//        employeeAfter.setAge(40);
//        System.out.println("员工二的信息：");
//        System.out.println(employeeAfter);
//        System.out.println("员工一的信息：");
//        System.out.println(employee);
//    }



    public static void main(String[] args) {
        System.out.println("克隆之前：");
        Address address=new Address("中国","湖南","株洲");
        Employee employee=new Employee("刘鹏",20,address);
        System.out.println("员工一的信息：");
        System.out.println(employee);
        System.out.println("克隆之后：");
        Employee employeeAfter=employee.clone();
        employeeAfter.getAddress().setProvinces("四川");
        employeeAfter.getAddress().setCity("成都");
        employeeAfter.setName("李鹏");
        employeeAfter.setAge(40);
        System.out.println("员工二的信息：");
        System.out.println(employeeAfter);
        System.out.println("员工一的信息：");
        System.out.println(employee);
    }
}
