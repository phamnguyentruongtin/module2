package projectmodule2.bai_thi.services;

import projectmodule2.bai_thi.controller.Controller;
import projectmodule2.bai_thi.exception.NotFoundException;
import projectmodule2.bai_thi.model.DienThoaiChinhHang;
import projectmodule2.bai_thi.model.DienThoaiXachTay;
import projectmodule2.bai_thi.repo.IRepostory;
import projectmodule2.bai_thi.repo.Repostory;

import java.util.Scanner;

public class Services implements IServices {
    Scanner sc = new Scanner(System.in);
    IRepostory repostory = new Repostory();

    @Override
    public void them() {
        try {
            System.out.println("nhập id");
            int id = Integer.parseInt(sc.nextLine());
            System.out.println("Nhap ten");
            String ten = sc.nextLine();
            System.out.println("Nhap gia");
            String gia = sc.nextLine();
            System.out.println("Nhap so luong");
            String soLuong = sc.nextLine();
            System.out.println("Nhap Nha san xuat");
            String nhaSanXuat = sc.nextLine();
            if (Controller.chonDeThem == 1) {
                System.out.println("Nhap thoi gian bao hanh");
                String thoiGianBaoHanh = sc.nextLine();
                System.out.println("pham vi bao hanh");
                System.out.println("1 Trong nuoc");
                System.out.println("2 Nuoc ngoai");
                int chonThem = Integer.parseInt(sc.nextLine());
                String phamvi = "";
                switch (chonThem) {
                    case 1:
                        phamvi = "Trong nuoc";
                        break;
                    case 2:
                        phamvi = "Nuoc ngoai";
                        break;
                    default:
                        phamvi = "";
                }
                DienThoaiChinhHang dienThoaiChinhHang = new DienThoaiChinhHang(id, ten, gia, soLuong, nhaSanXuat, thoiGianBaoHanh, phamvi);
                repostory.themMoi(dienThoaiChinhHang);
            }
            if (Controller.chonDeThem == 2) {
                System.out.println("Quoc gia xach tay");
                String quocGia = sc.nextLine();
                System.out.println("Trang Thai");
                System.out.println("1 Da sua Chua");
                System.out.println("2 Chua sua chua");
                int chonThem = Integer.parseInt(sc.nextLine());
                String trangThai = "";
                switch (chonThem) {
                    case 1:
                        trangThai = "Da sua Chua";
                        break;
                    case 2:
                        trangThai = "Chua sua chua";
                        break;
                    default:
                        break;
                }
                DienThoaiXachTay dienThoaiXachTay = new DienThoaiXachTay(id, ten, gia, soLuong, nhaSanXuat, quocGia, trangThai);
                repostory.themMoi(dienThoaiXachTay);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void xoa() throws NotFoundException {
        if (repostory.dienThoaiList.size() < 0) {
            System.out.println("danh sach rong");
        } else {
            hienThi();
            System.out.println("Nhap id ban muon xoa");
            int id = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < repostory.dienThoaiList.size(); i++) {
                if (id == repostory.dienThoaiList.get(i).getId()) {
                    System.out.println("Nhap yes neu ban muon xoa hoac no de hoan tac");
                    String dongY = sc.nextLine();
                    if (dongY.equalsIgnoreCase("yes")) {
                        repostory.xoa(i);
                        System.out.println("xoa thanh cong");
                    } else {
                        System.out.println("da hoan tac");
                    }
                } else {
                    throw new NotFoundException("khong tim thay san pham");
                }
                break;
            }
        }
    }

        @Override
        public void timKiem () throws NotFoundException {
                hienThi();
                System.out.println("Nhap id ban muon tim kiem");
                int id = Integer.parseInt(sc.nextLine());
                for (int i = 0; i < repostory.dienThoaiList.size(); i++) {
                    if (id == repostory.dienThoaiList.get(i).getId()) {
                        repostory.timKiem(i);
                    } else {
                        throw new NotFoundException("khong tim thay san pham");
                    }
                    break;
                }
            }


        @Override
        public void hienThi () {
            repostory.hienThi();
        }

    }

