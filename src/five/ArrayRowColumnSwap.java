package five;


/*
二位数组的行和列数量相同，才有行列互换
 */
public class ArrayRowColumnSwap {
    public static void main(String[] args) {
        int arr[][]=new int[][]{{1,2},{4,5}};
        System.out.println("行列互换前：");

        //输出二位数组
        printArray(arr);

        int arr2[][]=new int[arr.length][arr.length];
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                arr2[i][j]=arr[j][i];
            }
        }
        System.out.println("行列互换后：");
        printArray(arr2);
    }

    public static void printArray(int[][] arr) {
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.println(arr[i][j]+"");
            }
            System.out.println();
        }

    }
}
