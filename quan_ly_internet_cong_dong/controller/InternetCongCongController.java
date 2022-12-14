package projectmodule2.quan_ly_internet_cong_dong.controller;

import projectmodule2.quan_ly_internet_cong_dong.exception.NotFoundException;
import projectmodule2.quan_ly_internet_cong_dong.services.*;

import java.util.Scanner;

public class InternetCongCongController {
    private static Scanner sc = new Scanner(System.in);
    private static int selectedMayThuong = 0;
    private static boolean backToMenu = true;
    private static int selected = 0;
    private static int selectedMayStrem = 0;
    private static int selectedMAyCouple = 0;
    private static IServicesPhongMayThuong servicesPhongMayThuong = new ServicePhongMayThuong();
    private static IServicePhongMayCouple servicePhongMayCouple = new ServicePhongMayCouple();
    private static IServicePhongMayStreamer servicePhongMayStreamer = new ServicePhongMayStreamer();

    public static void main(String[] args) {
        do {
            System.out.println("-----HỆ THỐNG QUẢN LÝ-----");
            System.out.println("1 MÁY THƯỜNG");
            System.out.println("2 MÁY STREAM");
            System.out.println("3 MÁY COUPLE");
            System.out.println("4 THOÁT CHƯƠNG TRÌNH");
            System.out.println("--VUI LÒNG CHỌN CHỨC NĂNG--");
            selected = Integer.parseInt(sc.nextLine());
            switch (selected) {
                case 1:
                    do {
                        System.out.println("MÁY THƯỜNG");
                        System.out.println("1 Tạo Tài Khoản");
                        System.out.println("2 Xóa Tài Khoản");
                        System.out.println("3 Hiển Thị Danh Sách Tài Khoản");
                        System.out.println("4 Tìm Kiếm Tài Khoản");
                        System.out.println("5 Quay Trở Lại Màn Hình Chính");
                        System.out.println("---Vui Lòng Chọn Chức Năng---");
                        try {
                            selectedMayThuong = Integer.parseInt(sc.nextLine());
                        } catch (NullPointerException e) {
                            e.printStackTrace();
                        }
                        switch (selectedMayThuong) {
                            case 1:
                                try {
                                    servicesPhongMayThuong.addNormal();
                                } catch (NotFoundException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 2:
                                try {
                                    servicesPhongMayThuong.removeNormal();
                                } catch (NotFoundException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 3:
                                try {
                                    servicesPhongMayThuong.displayNormal();
                                } catch (NotFoundException e) {
                                    e.printStackTrace();
                                }

                                break;
                            case 4:
                                try {
                                    servicesPhongMayThuong.searchNormal();
                                } catch (NotFoundException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 5:
                                backToMenu = false;
                            default:
                                System.out.println("Vui Lòng Nhập Đúng Chức Năng!!!");

                        }
                    } while (backToMenu);
                    break;
                case 2:
                    do {
                        System.out.println("MÁY STREAM");
                        System.out.println("1 Tạo Tài Khoản");
                        System.out.println("2 Xóa Tài Khoản");
                        System.out.println("3 Hiển Thị Danh Sách Tài Khoản");
                        System.out.println("4 Tìm Kiếm Tài Khoản");
                        System.out.println("5 Quay Trở Lại Màn Hình Chính");
                        System.out.println("---Vui Lòng Chọn Chức Năng---");
                        selectedMayStrem = Integer.parseInt(sc.nextLine());
                        switch (selectedMayStrem) {
                            case 1:
                                try {
                                    servicePhongMayStreamer.addStream();
                                } catch (NotFoundException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 2:
                                try {
                                    servicePhongMayStreamer.removeStream();
                                } catch (NotFoundException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 3:
                                try {
                                    servicePhongMayStreamer.displayStream();
                                } catch (NotFoundException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 4:
                                try {
                                    servicePhongMayStreamer.searchStream();
                                } catch (NotFoundException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 5:
                                backToMenu = false;
                                break;
                            default:
                                System.out.println("Vui Lòng Nhập đúng chức năng!!");
                        }
                    } while (backToMenu);
                    break;
                case 3:
                    do {
                        System.out.println("MÁY COUPLE");
                        System.out.println("1 Tạo Tài Khoản");
                        System.out.println("2 Xóa Tài Khoản");
                        System.out.println("3 Hiển Thị Danh Sách Tài Khoản");
                        System.out.println("4 Tìm Kiếm Tài Khoản");
                        System.out.println("5 Quay Trở Lại Màn Hình Chính");
                        System.out.println("---Vui Lòng Chọn Chức Năng---");
                        selectedMAyCouple = Integer.parseInt(sc.nextLine());
                        switch (selectedMAyCouple) {
                            case 1:
                                try {
                                    servicePhongMayCouple.addCouple();
                                } catch (NotFoundException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 2:
                                try {
                                    servicePhongMayCouple.removeCouple();
                                } catch (NotFoundException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 3:
                                try {
                                    servicePhongMayCouple.displayCoupleList();
                                } catch (NotFoundException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 4:
                                try {
                                    servicePhongMayCouple.searchCouple();
                                } catch (NotFoundException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 5:
                                backToMenu = false;
                                break;
                            default:
                                System.out.println(" Vui Lòng nhập đúng chức năng!!!");
                        }

                    } while (backToMenu);
                    break;
                case 4:
                    System.exit(selected);
                    System.out.println("thank you use");
                default:
                    System.out.println("Vui lòng nhập đúng chức năng!!!");
            }

        } while (true);
    }
}
