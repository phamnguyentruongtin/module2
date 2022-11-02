package oop_lon.truc;

import jdk.nashorn.internal.parser.Scanner;

public abstract class Hinh {
    protected String tenHinh ;

    public Hinh(String tenHinh) {
        this.tenHinh = tenHinh;
    }

    public Hinh() {
    }

    public String getTenHinh() {
        return tenHinh;
    }

    public void setTenHinh(String tenHinh) {
        this.tenHinh = tenHinh;
    }

    public abstract void tinhChuvi();
    public abstract void tinhDienTich();


}
