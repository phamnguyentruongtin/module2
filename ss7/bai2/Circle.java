package projectmodule2.ss7.bai2;

public class Circle implements Colorable{
    private boolean filler = true;
    private String mau = "blue";

    public Circle(boolean filler, String mau) {
        this.filler = filler;
        this.mau = mau;
    }

    public boolean isFiller() {
        return filler;
    }

    public void setFiller(boolean filler) {
        this.filler = filler;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "filler=" + filler +
                ", mau='" + mau + '\'' +
                '}';
    }

    @Override
    public void howToColor() {

    }
}
