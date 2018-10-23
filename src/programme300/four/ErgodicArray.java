package programme300.four;

public class ErgodicArray {
    public static void main(String[] args) {
        String[] aves =new String[]{"白鹭","黄鹂","乌鸦"};
        int index=0;
        System.out.println("我的花园里有很多鸟，包括：");
        while (index<aves.length){
            System.out.println(aves[index++]);
        }
    }
}
