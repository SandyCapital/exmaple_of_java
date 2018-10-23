package programme300.seven;

public class Excel {

    private Inner inner=null;

    /*定义一个内部类*/
    class Inner{
        Inner(){
            System.out.println("创建一个内部类的引用");
        }
    }

    /*外部类中定义一个返回Inner类型对象的方法*/
    public Inner getInstance(){
        if (inner==null){
            return new Inner();
        }
        return inner;
    }

    public static void main(String[] args) {
        Excel excel=new Excel();

   //第一种方式
        Excel.Inner inner=excel.getInstance();

   //第二种方式
        Excel.Inner inner1=excel.new Inner();
    }
}
