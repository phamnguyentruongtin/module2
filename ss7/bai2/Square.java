package projectmodule2.ss7.bai2;

public class Square extends Circle{
    private double Lenght = 1.0;


    public Square(boolean filler, String mau, double lenght) {
        super(filler, mau);
        Lenght = lenght;
    }

    public double getLenght() {
        return Lenght;
    }

    public void setLenght(double lenght) {
        Lenght = lenght;
    }
    public void howToColor(){
        System.out.println("color all four side ... ");
    }
}
