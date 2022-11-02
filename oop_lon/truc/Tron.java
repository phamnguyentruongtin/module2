package oop_lon.truc;

public class Tron extends Hinh {
    private  double r;

    public Tron(String tenHinh, double r) {
        super(tenHinh);
        this.r = r;
    }

    public Tron() {
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public void tinhChuvi() {
       double s = getR() * 2 * Math.PI;
       DanhSach.hinhList.add(s);
    }

    @Override
    public void tinhDienTich() {
        double v = getR() * getR() * Math.PI;
        DanhSach.hinhList.add(v);
    }
}
