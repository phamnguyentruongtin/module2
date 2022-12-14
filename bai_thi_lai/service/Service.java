package projectmodule2.bai_thi_lai.service;

import projectmodule2.bai_thi_lai.controller.Controller;
import projectmodule2.bai_thi_lai.exception.NotFoundException;
import projectmodule2.bai_thi_lai.model.BenhAnDacBiet;
import projectmodule2.bai_thi_lai.model.BenhAnThuong;
import projectmodule2.bai_thi_lai.repo.IRepo;
import projectmodule2.bai_thi_lai.repo.Repo;
import projectmodule2.bai_thi_lai.validator.Validate;

import java.util.Scanner;

public class Service implements IService {
    Controller controller = new Controller();
    IRepo repo = new Repo();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void them() {
        int soThutu = 0;
        if (repo.danhSachBenhAn.size() <= 0) {
            soThutu += 1;
        } else {
            soThutu = repo.danhSachBenhAn.size() + 1;
        }
        System.out.println("Nhap ma benh an");
        String maBenhAn = scanner.nextLine();
        System.out.println("Nhap ten benh nhan");
        String tenBenhNhAn = scanner.nextLine();
        System.out.println("Nhap ngay nhap vien");
        String ngayNhapVien = scanner.nextLine();
        System.out.println("Nhap ngay ra vien");
        String ngayRaVien = scanner.nextLine();
        System.out.println("Nhap ly do nhap vien");
        String lyDo = scanner.nextLine();
        if (controller.chon == 1) {
            System.out.println("Nhap vien phi");
            Double vienPhi = Double.valueOf(scanner.nextLine());
            BenhAnThuong benhAnThuong = new BenhAnThuong(maBenhAn, soThutu, tenBenhNhAn, ngayNhapVien, ngayRaVien, lyDo, vienPhi);
            repo.themRepo(benhAnThuong);
        } else if (controller.chon == 2) {
            System.out.println("Chon hang uu tien");
            System.out.println("1 VIP I");
            System.out.println("2 VIP II");
            System.out.println("3 VIP III");
            String hangUuTien = "";
            int chonHang = Integer.parseInt(scanner.nextLine());
            switch (chonHang) {
                case 1:
                    hangUuTien = "VIP I";
                    break;
                case 2:
                    hangUuTien = "VIP II";
                    break;
                case 3:
                    hangUuTien = "VIP III";
                    break;
                default:
                    hangUuTien = "chua chon";
            }
            System.out.println("nhap thoi hang");
            String thoiHan = scanner.nextLine();
            BenhAnDacBiet benhAnDacBiet = new BenhAnDacBiet(maBenhAn, soThutu, tenBenhNhAn, ngayNhapVien, ngayRaVien, lyDo, hangUuTien, thoiHan);
            repo.themRepo(benhAnDacBiet);
        }
    }

    @Override
    public void xoa() throws NotFoundException {
        if (repo.danhSachBenhAn.size() < 0) {
            System.out.println("danh sach rong");
        } else {
            hienThi();
            System.out.println("Nhap ma benh an ban muon xoa");
            String maBenhAn = scanner.nextLine();
            for (int i = 0; i < repo.danhSachBenhAn.size(); i++) {
                if (maBenhAn.equalsIgnoreCase(repo.danhSachBenhAn.get(i).getMaBenhAn())) {
                    System.out.println("Nhap yes neu ban muon xoa hoac no de hoan tac");
                    String dongY = scanner.nextLine();
                    if (dongY.equalsIgnoreCase("yes")) {
                        repo.xoaRepo(i);
                        System.out.println("xoa thanh cong");
                    } else {
                        System.out.println("da hoan tac");
                    }
                } else {
                    throw new NotFoundException("khong tim thay");
                }
                break;
            }

        }
    }


    @Override
    public void hienThi() {
        repo.hienThiRepo();
    }
}
