package programme300.five;

public class QuickSort {


    public static int divide(int[] a,int start,int end){
        //每一次都以最右边的元素作为基准值
        int base=a[end];
        //start一旦等于end，就说明左右两个指针合并到了同一位置，可以结束此轮循环。
        while (start<end){
            while (start<end&&a[start]<=base)
                //从左边开始遍历，如果比基准值小，就继续向右走
                start++;
            //上面的while循环结束时，就说明当前的a[start]的值比基准值大，应与基准值进行交换
                if (start<end){
                    //交换
                    int temp=a[start];
                    a[start]=a[end];
                    a[end]=temp;
                    //交换后，此时的那个被调换的值也同时调到了正确的位置(基准值右边)，因此右边也要同时向前移动一位
                    end--;
                }
            while (start<end&&a[end]>=base)
                //从右边开始遍历，如果比基准值大，就继续向左走
                end--;
            //上面的while循环结束时，就说明当前的a[end]的值比基准值小，应与基准值进行交换
                if (start<end){
                    //交换
                    int temp=a[start];
                    a[start]=a[end];
                    a[end]=temp;
                    //交换后，此时的那个被调换的值也同时调到了正确的位置(基准值左边)，因此左边也要同时向后移动一位
                    start++;
                }
        }
        //这里返回start或者end皆可，此时的start和end都为基准值所在的位置
        return end;
    }


    public static void sort(int[]a,int start,int end){
        if (start>end){
            //如果只有一个元素，就不用再排下去了
            return;
        }
        else {
            //如果不止一个元素，继续划分两边递归排序下去
            int partition=divide(a,start,end);
            sort(a,start,partition-1);
            sort(a,partition+1,end);
        }
    }


    public static void main(String[] args) {
        int[] a={2,5,9,4,6};

        sort(a,0,a.length-1);
        System.out.println("排序后的结果：");
        for (int num:a){
            System.out.println(num+" ");
        }
    }



}
