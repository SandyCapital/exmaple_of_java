package programme300.seven;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Comparable接口用于强行对实现他的每个类的对象进行整体排序
 */

public class EmployeeComparable implements Comparable<EmployeeComparable> {
    private int id;
    private String name;
    private int age;

    public EmployeeComparable(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    //用于指定排序规则
    @Override
    public int compareTo(EmployeeComparable o) {  //利用编号实现对象之间的比较
        if (id>o.id){
            return 1;
        }
        else if (id<o.id){
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("员工的编号："+id+",");
        stringBuilder.append("员工姓名："+name+",");
        stringBuilder.append("员工的年龄："+age);
        return stringBuilder.toString();
    }


    public static void main(String[] args) {
        List<EmployeeComparable> list=new ArrayList<EmployeeComparable>();
        list.add(new EmployeeComparable(3,"Java",21));
        list.add(new EmployeeComparable(2,"Java",22));
        list.add(new EmployeeComparable(4,"Java",23));
        System.out.println("排序前：");
        for (EmployeeComparable e:list){
            System.out.println(e+" ");
        }
        System.out.println("排序后：");

        /**
         * 保存到列表中，执行Collections.sort();
         * 如果保存到数组，执行Arrays.sort()进行自动排序
         */

        Collections.sort(list);
        for (EmployeeComparable e:list){
            System.out.println(e+" ");
        }
    }
}
