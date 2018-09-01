package five;

/**
 * 选择排序
 * 平均O(n^2),最好O(n^2),最坏O(n^2);空间复杂度O(1);不稳定;简单
 * @author zeng
 *
 */

public class SelectionSort {
    public static void selectSort(int[] a){
        int n=a.length;
        for (int i=0;i<n;i++){
            int k=i;

            //找出最小值的坐标
            for (int j=i+1;j<n;j++){
                if (a[j]<a[k]){
                    k=j;
                }
            }

            //将最小值放到排序序列的末尾
            if (k>i){
                int tmp=a[i];
                a[i]=a[k];
                a[k]=tmp;
            }
        }
    }

    public static void main(String[] args) {
        int[] b={27,13,25,19,44,28,39};
        selectSort(b);
        for (int i:b){
            System.out.println(i+" ");
        }
    }
}
