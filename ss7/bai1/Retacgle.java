package projectmodule2.ss7.bai2.bai1;

public class Retacgle extends shape implements Resizeable {
    private double dai = 1.0;
    private double rong = 1.0;

    public Retacgle(String color, boolean filler, double dai, double rong) {
        super(color, filler);
        this.dai = dai;
        this.rong = rong;
    }

    public double getDai() {
        return dai;
    }

    public void setDai(double dai) {
        this.dai = dai;
    }

    public double getRong() {
        return rong;
    }

    public void setRong(double rong) {
        this.rong = rong;
    }

    @Override
    public double getArea() {
        return getDai() * getRong();
    }

    public double getPermier() {
        return (getDai() + getRong()) * 2;
    }

    public void resize(double percent) {
        setRong(getRong() * (1 + percent / 100));
    }

    @Override
    public String toString() {
        return "Retacgle{" +
                "dai=" + dai +
                ", rong=" + rong +
                '}';
    }
}
