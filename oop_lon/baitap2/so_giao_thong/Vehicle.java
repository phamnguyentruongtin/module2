package oop_lon.baitap2.so_giao_thong;

import java.util.Objects;

public class Vehicle {
    private String tenChuXe;
    private String loaiXe;
    private int dungTich;
    private double triGia;
    private double thuePhaiNop;

    public Vehicle() {
    }

    public Vehicle(String tenChuXe, String loaiXe, int dungTich, double triGia, double thuePhaiNop) {
        this.tenChuXe = tenChuXe;
        this.loaiXe = loaiXe;
        this.dungTich = dungTich;
        this.triGia = triGia;
        this.thuePhaiNop = thuePhaiNop;
    }

    public String getTenChuXe() {
        return tenChuXe;
    }

    public void setTenChuXe(String tenChuXe) {
        this.tenChuXe = tenChuXe;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    public double getTriGia() {
        return triGia;
    }

    public void setTriGia(double triGia) {
        this.triGia = triGia;
    }

    public double getThuePhaiNop() {
        return thuePhaiNop;
    }

    public void setThuePhaiNop(double thuePhaiNop) {
        this.thuePhaiNop = thuePhaiNop;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "tenChuXe='" + tenChuXe + '\'' +
                ", loaiXe='" + loaiXe + '\'' +
                ", dungTich='" + dungTich + '\'' +
                ", triGia=" + triGia +
                ", thuePhaiNop=" + thuePhaiNop +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle)) return false;
        Vehicle vehicle = (Vehicle) o;
        return getLoaiXe().equals(vehicle.getLoaiXe());
    }

}
