package oop_lon.truc;

public class TamGiac extends Hinh {
    private int a;
    private int b;
    private int c;

    @Override
    public void tinhChuvi() {
      int v =  getA() + getB() + getC();
      DanhSach.hinhList.add((double) v);
    }

    public TamGiac(String tenHinh, int a, int b, int c) {
        super(tenHinh);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public TamGiac() {
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public void tinhDienTich() {
        int p = (getA() + getB() +getC()) / 2;
        int s = (int) Math.sqrt(p * (p - getA()) * (p - getB()) * (p - getC()));
        DanhSach.hinhList.add((double) s);

    }
}
