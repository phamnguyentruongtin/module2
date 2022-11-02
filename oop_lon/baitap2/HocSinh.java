package oop_lon.baitap2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HocSinh {
    private String hoTen;
    private String lop;
    private double toan;
    private double ly;
    private double hoa;
    private List<Double> dtbList = new ArrayList<Double>();

    public HocSinh() {
    }

    public HocSinh(String hoTen, String lop, double toan, double ly, double hoa) {
        this.hoTen = hoTen;
        this.lop = lop;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public double getToan() {
        return toan;
    }

    public void setToan(double toan) {
        this.toan = toan;
    }

    public double getLy() {
        return ly;
    }

    public void setLy(double ly) {
        this.ly = ly;
    }

    public double getHoa() {
        return hoa;
    }

    public void setHoa(double hoa) {
        this.hoa = hoa;
    }
    private void tinhDTB(double toan,double ly,double hoa){
       double dtb = (toan + ly + hoa)/3;
       dtbList.add(dtb);
    }
    private void inDanhSachDTB(){
        for (Double d : dtbList) {
            if (d>=5){
                System.out.println("hoc sinh co DTB >= 5 la : "+d);
            }
        }
    }

    @Override
    public String toString() {
        return "HocSinh{" +
                "hoTen='" + hoTen + '\'' +
                ", lop='" + lop + '\'' +
                ", toan=" + toan +
                ", ly=" + ly +
                ", hoa=" + hoa +
                "danhsach =" + dtbList +
                '}';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten : ");
        String hoTen = sc.nextLine();
        System.out.println("Nhap ten lop : ");
        String tenLop = sc.nextLine();
        System.out.println("Nhap diem toan : ");
        double toan = Double.parseDouble(sc.nextLine());
        System.out.println("Nhap diem ly : ");
        double ly = Double.parseDouble(sc.nextLine());
        System.out.println("Nhap diem hoa : ");
        double hoa = Double.parseDouble(sc.nextLine());
        HocSinh hs = new HocSinh(hoTen,tenLop,toan,ly,hoa);
        hs.tinhDTB(toan,ly,hoa);
        System.out.println(hs);


    }
}
