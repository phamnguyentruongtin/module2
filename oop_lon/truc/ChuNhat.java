package oop_lon.truc;

public class ChuNhat extends Hinh{
    private double a ;
    private double b;

    public ChuNhat(String tenHinh, double a, double b) {
        super(tenHinh);
        this.a = a;
        this.b = b;
    }

    public ChuNhat() {
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public void tinhChuvi() {
        double v = (getA() + getB()) * 2;
        DanhSach.hinhList.add(v);
    }

    @Override
    public void tinhDienTich() {
        double s = getA() *  getB();
        DanhSach.hinhList.add(s);
    }
}
