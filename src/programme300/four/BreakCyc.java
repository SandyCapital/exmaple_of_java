package programme300.four;

public class BreakCyc {
    public static void main(String[] args) {
        System.out.println("\n-----中断单层循环的例子----");
        String[] array=new String[]{"老鹰","黄鹂","小鹰"};
        System.out.println("等你发现小鹰之前都有些什么鸟:");
        for (String string:array){
            if (string.equals("小鹰"))
                break;
            System.out.println(string);
        }
        System.out.println("\n\n----中断双层循环的例子----");
        //创建成绩数组
        int[][] myScores=new int[][]{{67,78,61,66},{55,68,75,95}};
        System.out.println("宝宝这次考试成绩：\n数学\t语文\t历史\t美术");
        No1:for (int[]is:myScores){
            for (int i:is){
                System.out.print(i+"\t");
                if (i<60){
                    System.out.println("\n等："+i+"分的是什么？为什么这个不及格？");
                    break No1;
                }
            }
            System.out.println();
        }
    }
}
