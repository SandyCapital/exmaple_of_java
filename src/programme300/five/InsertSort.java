package programme300.five;

public class InsertSort {
    private int[] array;
    private int length;

    public InsertSort(int[] array){
        this.array=array;
        this.length=array.length;
    }
    public void display(){
        for (int a:array){
            System.out.println(a+" ");
        }
        System.out.println();
    }

    public void doInsertSort(){
        for (int index=1;index<length;index++){  //外层向右的index，即作为比较对象的数据的index
            int temp =array[index];   //用作比较的数据
            int leftIndex=index-1;
            while (leftIndex>=0&&array[leftIndex]>temp){  //当比到最左边或者遇到比temp小的数据时，结束循环
                array[leftIndex+1]=array[leftIndex];
                leftIndex--;
            }
            array[leftIndex+1]=temp;  //把temp放到空位上
        }
    }

    public static void main(String[] args) {
        int[] array = {2,5,4,6,3,1};
        InsertSort is=new InsertSort(array);
        System.out.println("排序前的数据为：");
        is.display();
        is.doInsertSort();
        System.out.println("排序后的数据为：");
        is.display();
    }
}
