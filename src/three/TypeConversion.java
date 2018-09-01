package three;

public class TypeConversion {
    public static void main(String[] args) {
        byte b=127;
        char c='w';
        short s=23561;
        int i=333;
        Long l=400000L;
        float f=3.141592f;
        double d=54.523;

        System.out.println("累加byte等于："+b);
        System.out.println("累加char等于："+(b+c));
        System.out.println("累加short等于："+(b+c+s));
        System.out.println("累加int等于："+(b+c+s+i));
        System.out.println("累加long等于："+(b+c+s+i+l));
        System.out.println("累加float等于："+(b+c+s+i+l+f));
        System.out.println("累加double等于："+(b+c+s+i+l+f+d));

        //System.out.println("把long强制类型转换为int："+(int)l);

        //System.out.println("把long强制类型转换为short："+(short)l);

        System.out.println("把double强制类型转换为int："+(int)d);

        System.out.println("把short强制类型转换为char："+(char)s);
    }
}
