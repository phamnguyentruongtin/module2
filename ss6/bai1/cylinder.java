package projectmodule2.ss6.bai1;

import projectmodule2.ss6.bai1.circle;

public class cylinder extends circle {
    private double height;


    public cylinder(double radius, String color, double height) {
        super(radius, color);
    }

    public cylinder(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public cylinder() {

        super();
    }
    public double areacylinder(){
        return 2 * Math.PI * getRadius() * getRadius() + 2 * Math.PI * getRadius() * getHeight();
    }

    @Override
    public String toString() {
        return "cylinder{" +
                "height=" + height +
                "area = "+areacylinder() +
                '}';
    }
}
