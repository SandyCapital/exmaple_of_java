package eleven;

public class ExceptionTest {
    public static void main(String[] args) {
        System.out.println("-1.0/0="+(-1.0/0));
        System.out.println("+1.0/0="+(-+.0/0));
        try{
            System.out.println("-1.0/0="+(-1.0/0));
        }catch (Exception e){
            System.out.println("抛出异常:"+e.getMessage());
        }
            }
}
