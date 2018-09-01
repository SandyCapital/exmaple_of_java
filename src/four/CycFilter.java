package four;

public class CycFilter {
    public static void main(String[] args) {
        String[] array=new String[]{"白鹭","老鹰","黄鹂","老鹰","乌" +
                "鸦","老鹰","老鹰"};
        System.out.println("在我的花园里有很多鸟，最近来了几只老鹰，请抓走");
        int eagleCount=0;
        for (String string:array){
            if (string.equals("老鹰")){
                System.out.println("发现一只老鹰，已经抓到笼子里");
                eagleCount++;
                continue;
            }
            System.out.println("搜索鸟类，发现了："+string);
        }
        System.out.println("一共抓到了"+eagleCount+"只老鹰");
    }
}
