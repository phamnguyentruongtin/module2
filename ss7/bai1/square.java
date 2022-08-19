package projectmodule2.ss7.bai2.bai1;

public class square extends shape implements Resizeable{
    private double lenght = 1.0;

    public square(String color, boolean filler, double lenght) {
        super(color, filler);
        this.lenght = lenght;
    }

    @Override
    public double getArea() {
        return lenght * lenght;
    }

    @Override
    public void resize(double percent) {

    }

    @Override
    public double getPermier() {
        return lenght * 4;
    }

    @Override
    public String toString() {
        return "square{" +
                "lenght=" + lenght +
                '}';
    }
}
