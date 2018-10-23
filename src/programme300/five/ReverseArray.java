package programme300.five;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6};
        for (int i=0;i<=array.length/2-1;i++){
            int tempFirst=array[i];
            int tempEnd=array[array.length-i-1];
            array[i]=tempEnd;
            array[array.length-i-1]=tempFirst;
        }
        for (int a:array){
            System.out.println(a+" ");
        }
    }
}
