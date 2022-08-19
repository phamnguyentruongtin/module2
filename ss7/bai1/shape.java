package projectmodule2.ss7.bai2.bai1;

public abstract class shape {
    private String color = "red";
    private boolean filler = true;

    public shape(String color, boolean filler) {
        this.color = color;
        this.filler = filler;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFiller() {
        return filler;
    }

    public void setFiller(boolean filler) {
        this.filler = filler;
    }
    public abstract double getArea();
    public abstract void resize(double percent);
    public abstract double getPermier();

    @Override
    public String toString() {
        return "shape{" +
                "color='" + color + '\'' +
                ", filler=" + filler +
                '}';
    }

}
