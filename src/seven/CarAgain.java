package seven;

public class CarAgain {
    private String name;
    private double speed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("车名："+name+",");
        stringBuilder.append("速度："+speed);
        return stringBuilder.toString();
    }
}
