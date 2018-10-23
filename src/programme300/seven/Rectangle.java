package programme300.seven;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length*width;
    }


    public static void main(String[] args) {
        Circle circle=new Circle(1);
        System.out.println("图形的名称是："+circle.getName());
        System.out.println("图形的面积是："+circle.getArea());

        Rectangle rectangle=new Rectangle(2,4);
        System.out.println("图形的名称是："+rectangle.getName());
        System.out.println("图形的面积是："+rectangle.getArea());


    }
}
