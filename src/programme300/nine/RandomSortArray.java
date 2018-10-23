package programme300.nine;



import java.util.Random;
import java.util.TreeSet;

public class RandomSortArray {
    public static void main(String[] args) {
        TreeSet<Integer> set=new TreeSet<Integer>();
        Random random=new Random();
        int count=0;
        while (count<10){
            boolean succeed=set.add(random.nextInt(100));
            if (succeed){
                count++;
            }
            Integer[] array=new Integer[set.size()];
            set.toArray(array);
            System.out.println("生成的重复随机数组内容如下：");
            for (int value:array){
                System.out.println(value+" ");
            }
        }
    }
}
