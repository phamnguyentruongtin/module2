package ss4;

public class bai3 {
    private static final int slow = 1;
    private static final int medium = 2;
    private static final int fast = 3;
    private String color = "blue";
    private int speed = slow;
    private boolean on = false;
    private double radius = 5;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (this.on) {
            return "speed = " + getSpeed() + "; radius = " + getRadius() + "; color " + getColor() + "; Quạt đang bật";
        } else return " radius = " + getRadius() + "; color " + getColor() + "; Quạt đang tắt";
    }
    public static void main(String[] args) {

        bai3 fan1 = new bai3();
        fan1.setSpeed(fast);
        fan1.setOn(true);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        System.out.println("fan1 = " + fan1);

        bai3 fan2 = new bai3();
        fan2.setSpeed(medium);
        fan2.setOn(true);
        System.out.println("fan2 = " + fan2);
    }

}




