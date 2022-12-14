package projectmodule2.quan_ly_internet_cong_dong.services;

import projectmodule2.quan_ly_internet_cong_dong.exception.NotFoundException;
import projectmodule2.quan_ly_internet_cong_dong.model.PhongMayThuong;
import projectmodule2.quan_ly_internet_cong_dong.repo.IRepoNormal;
import projectmodule2.quan_ly_internet_cong_dong.repo.RepoNormal;

import java.util.Scanner;

public class ServicePhongMayThuong implements IServicesPhongMayThuong {
    IRepoNormal repoNormal = new RepoNormal();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void addNormal() throws NotFoundException {
        System.out.println("Nhập tên tài Khoản");
        String taiKhoan = scanner.nextLine();
        System.out.println("Nhập mật khẩu");
        String matKhau = scanner.nextLine();
        System.out.println("1 để gọi dịch vụ \n2 để tắt");
        int selectservice = Integer.parseInt(scanner.nextLine());
        String dichVu = "";
        switch (selectservice) {
            case 1:
                dichVu = "Có dịch Vụ";
                break;
            case 2:
                dichVu = "khong có dịch vụ";
                break;
            default:
                System.out.println("vui lòng nhập đúng");
        }
        System.out.println("Góp ý về cấu hình máy");
        String cauHinh = scanner.nextLine();
        System.out.println("góp ý về không gian");
        String khongGian = scanner.nextLine();
        PhongMayThuong phongMayThuong = new PhongMayThuong(taiKhoan, matKhau, dichVu, cauHinh, khongGian);
        repoNormal.add(phongMayThuong);
        System.out.println("theem thanh cong");
    }

    @Override
    public void searchNormal() throws NotFoundException {
        repoNormal.displayList();
        if (repoNormal.phongMayThuongList.isEmpty()) {
            System.out.println("danh sách rỗng");
        } else {
            System.out.println("Nhập Tài Khoản bạn muốn tìm");
            String taiKhoan = scanner.nextLine();
            for (int i = 0; i < repoNormal.phongMayThuongList.size(); i++) {
                if (taiKhoan.equals(repoNormal.phongMayThuongList.get(i).getTaiKhoang())) {
                    repoNormal.search(i);
                } else {
                    System.out.println("không có trong danh sách!!!");
                }
                break;
            }

        }
    }

    @Override
    public void displayNormal() throws NotFoundException {
        repoNormal.displayList();

    }

    @Override
    public void removeNormal() throws NotFoundException {
        repoNormal.displayList();
        if (repoNormal.phongMayThuongList.isEmpty()) {
            System.out.println("danh sách rỗng");
        } else {
            System.out.println("nhập tài khoảng bạn muốn xóa");
            String taiKhoang = scanner.nextLine();
            String yourAcceptance = "";
            for (int i = 0; i < repoNormal.phongMayThuongList.size(); i++) {
                if (taiKhoang.equals(repoNormal.phongMayThuongList.get(i).getTaiKhoang())) {
                    System.out.println("bạn có chắc chắn muốn xóa");
                    yourAcceptance = scanner.nextLine();
                    if (yourAcceptance.equalsIgnoreCase("yes")) {
                        repoNormal.remove(i);
                        System.out.println("đã xóa thành công!!!");
                    } else {
                        System.out.println("bạn đã hoàn tác!!");
                    }

                }
                break;
            }
        }

}
}
