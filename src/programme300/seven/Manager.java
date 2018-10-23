package programme300.seven;


import java.util.Date;

/**
 * Manger类中没有定义姓名等域，然而却可以使用，这就是继承的好处
 */

public class Manager extends Employee {
    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String info() {
        return "子类：我是明日科技的经理！";
    }

    public static void main(String[] args) {
        Employee employee=new Employee();
        employee.setName("java");
        employee.setSalary(100);
        employee.setBirthday(new Date());
        System.out.println(employee.info());
        Manager manager=new Manager();
        manager.setName("明日科技");
        manager.setSalary(3000);
        manager.setBirthday(new Date());
        manager.setBonus(1000);
        System.out.println(manager.info());
    }
}



