package projectmodule2.bai_thi.controller;

import projectmodule2.bai_thi.exception.NotFoundException;
import projectmodule2.bai_thi.services.IServices;
import projectmodule2.bai_thi.services.Services;

import java.util.Scanner;

public class Controller {
    private static int chonChucNang;
    private static IServices services = new Services();
    private static Scanner sc = new Scanner(System.in);
    public static int chonDeThem;

    public static void main(String[] args) {
        do {
            System.out.println("--CHƯƠNG TRÌNH QUẢN LÝ ĐIỆN THOẠI--");
            System.out.println("Chọn chức năng theo số(để tiếp tục)");
            System.out.println("1 Thêm mới");
            System.out.println("2 Xóa");
            System.out.println("3 Xem danh sách điện thoại");
            System.out.println("4 Tìm kiếm");
            System.out.println("5 Thoát");
            chonChucNang = Integer.parseInt(sc.nextLine());
            switch (chonChucNang) {
                case 1:
                    System.out.println("1 Điện thoại chính hãng");
                    System.out.println("2 Điện thoại xách tay");
                    chonDeThem = Integer.parseInt(sc.nextLine());
                    switch (chonDeThem) {
                        case 1:
                            services.them();
                            break;
                        case 2:
                            services.them();
                            break;
                        default:
                            System.out.println("vui lòng nhập đúng!!");
                    }
                    break;
                case 2:
                    try {
                        services.xoa();
                    } catch (NotFoundException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    services.hienThi();
                    break;
                case 4:
                    try {
                        services.timKiem();
                    } catch (NotFoundException e) {
                        e.printStackTrace();
                    }catch (Exception e){
                        System.err.println("danh sach rong!!!");
                    }
                    break;
                case 5:
                    System.exit(chonChucNang);
                default:
                    System.out.println("vui lòng nhập đúng chức năng!!!");
            }
        }
        while (true);
    }
}
