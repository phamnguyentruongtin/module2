package projectmodule2.ss16.QuanLySanPham.controller;
import projectmodule2.ss16.QuanLySanPham.exception.NotFoundProductException;
import projectmodule2.ss16.QuanLySanPham.model.Product;
import projectmodule2.ss16.QuanLySanPham.services.IServices;
import projectmodule2.ss16.QuanLySanPham.services.Service;

import java.util.Scanner;

public class ProductController {
    private static IServices services = new Service();
    static Scanner sc = new Scanner(System.in);
    private static int selectServices;

    public static void main(String[] args) {
        do {
            System.out.println("-----Quản Lý Sản Phẩm-----");
            System.out.println("1 Thêm sản Phẩm ");
            System.out.println("2 Hiện thị danh sách sản phẩm ");
            System.out.println("3 Xóa sản phẩm ");
            System.out.println("4 Tìm kiếm sản phẩm ");
            System.out.println("5 Thoát chương trình");
            try {
                selectServices = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Nhập sai Format yêu cầu nhập lại !!!");
            }
            switch (selectServices) {
                case 1:
                    try {
                        Product product = services.getInfo();
                        services.addProduct(product);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    try {
                        services.displayPRoductList();
                    } catch (NotFoundProductException e) {
                        e.printStackTrace();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    try {
                        services.removeProduct();
                    } catch (NotFoundProductException e) {
                        e.printStackTrace();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    try {
                        services.searchProduct();
                    } catch (NotFoundProductException e) {
                        e.printStackTrace();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 5:
                    System.exit(selectServices);
                default:
                    System.out.printf("Vui lòng chọn đúng chức năng!!!");

            }
        } while (true);

    }
}
