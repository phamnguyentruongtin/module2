package projectmodule2.bai_thi_lai.controller;

import projectmodule2.bai_thi_lai.exception.NotFoundException;
import projectmodule2.bai_thi_lai.service.Service;
import java.util.Scanner;

public class Controller{
    static Scanner sc = new Scanner(System.in);
    private static int chonChucNang;
    public static int chon;
    private static Service service = new Service();

    public static void main(String[] args) {
        do {
            System.out.println("--Quan li Benh An--");
            System.out.println("1 them moi");
            System.out.println("2 xoa");
            System.out.println("3 xem danh sach benh an");
            System.out.println("4 thoat");
            System.out.println("VUI LONG CHON CHUC NANG!!");
            chonChucNang = Integer.parseInt(sc.nextLine());
            switch (chonChucNang) {
                case 1:
                    System.out.println("1 them moi benh nhan thuong");
                    System.out.println("2 them moi benh nhan VIP");
                    chon = Integer.parseInt(sc.nextLine());
                    switch (chon) {
                        case 1:
                            service.them();
                            break;
                        case 2:
                            service.them();
                            break;
                        default:
                            System.out.println("vui long nhap dung ");
                    }
                    break;
                case 2:
                 try {
                  service.xoa();
                 } catch (NotFoundException e) {
                  e.printStackTrace();
                 }
                 break;
                case 3:
                 service.hienThi();
                    break;
                case 4:
                    System.exit(chonChucNang);
                default:
                    System.out.println("vui long nhap dung");
            }
        } while (true);


    }
}
