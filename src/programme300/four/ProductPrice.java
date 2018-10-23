package programme300.four;

public class ProductPrice {
    public static void main(String[] args) {
        float money=1170;
        String rebate="";
        if (money>200){
            int grade= (int) money/200;
            switch (grade){
                case 1:
                    rebate="九五折";
                    break;
                case 2:
                    rebate="九折";
                    break;
                case 3:
                    rebate="八五折";
                    break;
                case 4:
                    rebate="八折";
                    break;
                case 5:
                    rebate="七折";
                    break;
                 default:
                     rebate="六折";
            }
        }
        System.out.println("您的累计消费金额为"+money);
        System.out.println("您享受的折扣为"+rebate);
    }
}
