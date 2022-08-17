package projectmodule2.ss6.bai1;

public class circle {
    private double radius;
    private String color;

    public circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public circle() {

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

    public double area() {
        return getRadius() * 2 * Math.PI;
    }

    @Override
    public String toString() {
        return "circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                "area =" + area() +
                '}';
    }

    public void setColor(String color) {
        this.color = color;
    }
}
