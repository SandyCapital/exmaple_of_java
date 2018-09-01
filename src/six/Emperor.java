package six;

public class Emperor {
    private static Emperor emperor=null;
    private Emperor(){}
    public static Emperor getInstance(){
        if (emperor==null){
            emperor=new Emperor();
        }
        return emperor;
    }
    public void getName(){
        System.out.println("我是皇帝");
    }

    public static void main(String[] args) {
        System.out.println("创建皇帝1对象");
        Emperor emperor=Emperor.getInstance();
        emperor.getName();
        System.out.println("创建皇帝2对象");
        Emperor emperor1=Emperor.getInstance();
        emperor1.getName();

    }
}
