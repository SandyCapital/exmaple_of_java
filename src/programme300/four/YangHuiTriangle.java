package programme300.four;

public class YangHuiTriangle {
    public static void main(String[] args) {
        //第一维设置杨辉三角的行数
        int triangle[][]=new int[10][];

            //遍历第一层数组
        for (int i=0;i<triangle.length;i++){
            triangle[i]=new int[i+1];
            //遍历第二层数组
            for (int j=0;j<=i;j++){
                if (i==0||j==0||j==i){
                    triangle[i][j]=1;
                }else {
                    triangle[i][j]=triangle[i-1][j]+triangle[i-1][j-1];
                }
                //输出这一层的数字
                System.out.println(triangle[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
