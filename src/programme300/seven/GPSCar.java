package programme300.seven;

import java.awt.*;

public class GPSCar extends CarAgain implements GPS {
    @Override
    public Point getLocation() {    //利用汽车的速度来确定汽车的位置
        Point point=new Point();
        point.setLocation(super.getSpeed(),super.getSpeed());
        return point;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder=new StringBuilder();

        //CarAgain类的toString方法
        stringBuilder.append(super.toString());
        stringBuilder.append(",坐标：（"+getLocation().x+","+getLocation().y+"）");
        return stringBuilder.toString();
    }


    public static void main(String[] args) {
        System.out.println("自定义普通的汽车：");
        CarAgain carAgain=new CarAgain();
        carAgain.setName("Audi");
        carAgain.setSpeed(60);
        System.out.println(carAgain);
        System.out.println("自定义GPS汽车");
        GPSCar gpsCar=new GPSCar();
        gpsCar.setName("Audi");
        gpsCar.setSpeed(60);
        System.out.println(gpsCar);
    }
}
