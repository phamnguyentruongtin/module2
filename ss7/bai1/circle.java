package projectmodule2.ss7.bai2.bai1;

public class circle extends shape implements Resizeable{
    private double radius ;


    public circle(String color, boolean filler, double radius) {
        super(color, filler);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getPermier(){
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "circle{" +
                "radius=" + radius +
                '}'+ getRadius()
                + ",which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        setRadius(Math.sqrt(getRadius() * getRadius() * (1 + percent / 100)));
    }
}
