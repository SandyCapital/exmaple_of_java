package programme300.six;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeTest implements Cloneable,Serializable {
    private static final long serialVersionId=45656546464L;
    private String name;
    private int age;

    public EmployeeTest(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("姓名："+name+",");
        stringBuilder.append("年龄："+age+"," );
        return stringBuilder.toString();
    }

    @Override
    protected EmployeeTest clone(){
        EmployeeTest employeeTest=null;
        try{
            employeeTest= (EmployeeTest) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return employeeTest;
    }

    public static void main(String[] args) {

        List<EmployeeTest> employeeTests=new ArrayList<EmployeeTest>();
        EmployeeTest employeeTest=new EmployeeTest("刘鹏",20);
        long currentTime=System.currentTimeMillis();

        //克隆
        for (int i=0;i<100000;i++){
            employeeTests.add(employeeTest.clone());
        }
        System.out.println("克隆花费时间为："+(System.currentTimeMillis()-currentTime)+"毫秒");


        //序列化
        currentTime=System.currentTimeMillis();
        for (int i=0;i<100000;i++){
            ByteArrayOutputStream baos=new ByteArrayOutputStream();
            ObjectOutputStream out=null;
            try{
                out=new ObjectOutputStream(baos);
                out.writeObject(employeeTest);
            } catch (IOException e) {
                e.printStackTrace();
            }

            //ByteArrayInputStream只能用字节数组来进行构造
            ByteArrayInputStream bais=new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream in=null;
            try{
                in=new ObjectInputStream(bais);
                employeeTests.add((EmployeeTest) in.readObject());
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        System.out.println("序列花费时间为："+(System.currentTimeMillis()-currentTime)+"毫秒");
    }
}
