package oop_lon.baitap2.so_giao_thong;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int select;
    static private Serrvices s = new Serrvices();

    public static void main(String[] args) {
        do {
            System.out.println("1 nhap danh sach phuong tien giao thong \n" +
                    "2 xuat bang ke khai tien thue truoc ba cua xe \n" +
                    "3 in danh sach phuong tien giao thong theo loai xe \n" +
                    "4 in danh sach cac phuong tien giao thong gia tri lon nhat \n" +
                    "5 thoat \n");
            select = Integer.parseInt(sc.nextLine());
            switch (select) {
                case 1:
                    s.them();
                    break;
                case 2:
                    s.xuatKeTienThue();
                    break;
                case 3:
                    System.out.println("Nhap loai xe muon tim : ");
                    String loaiXeMuonTim = sc.nextLine();
                    s.indanhsachtheoloai(loaiXeMuonTim);
                    break;
                case 4:
                    s.indanhsachgiatrilon();
                    break;
                case 5:
                    System.exit(select);
                default:
                    System.out.println("vui long nhap dung chuc nang !!! ");
            }
        } while (true);

    }
}
