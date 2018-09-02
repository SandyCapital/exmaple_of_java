package seven;

public class CarFactory {
    public static Car getCar(String name){
        if (name.equalsIgnoreCase("Bmw")){
            return new Bmw();
        }
        else if (name.equalsIgnoreCase("Benz")){
            return new Benz();
        }
        else {
            return null;
        }
    }

    public static void main(String[] args) {
        System.out.println("顾客要宝马");
        Car bmw = CarFactory.getCar("Bmw");
        System.out.println("提取汽车：" + bmw.getInfo());

        System.out.println("顾客要奔驰");
        Car benz=CarFactory.getCar("benz");
        System.out.println("提取汽车："+benz.getInfo());
    }
}
