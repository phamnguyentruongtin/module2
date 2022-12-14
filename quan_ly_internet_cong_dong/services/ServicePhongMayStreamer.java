package projectmodule2.quan_ly_internet_cong_dong.services;

import projectmodule2.quan_ly_internet_cong_dong.exception.NotFoundException;
import projectmodule2.quan_ly_internet_cong_dong.model.PhongMayStreamers;
import projectmodule2.quan_ly_internet_cong_dong.repo.IRepoStreamer;
import projectmodule2.quan_ly_internet_cong_dong.repo.RepoStreamer;

import java.util.Scanner;

public class ServicePhongMayStreamer implements IServicePhongMayStreamer{
    IRepoStreamer repoStreamer = new RepoStreamer();
    Scanner sc = new Scanner(System.in);
    @Override
    public void addStream() throws NotFoundException {
        System.out.println("Nhập tên tài Khoản");
        String taiKhoan = sc.nextLine();
        System.out.println("Nhập mật khẩu");
        String matKhau = sc.nextLine();
        System.out.println("1 để gọi dịch vụ \n2 để tắt");
        int selectservice = Integer.parseInt(sc.nextLine());
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
        String cauHinh = sc.nextLine();
        System.out.println("góp ý về không gian");
        String khongGian = sc.nextLine();
        PhongMayStreamers phongMayStreamers = new PhongMayStreamers(taiKhoan,matKhau,dichVu,cauHinh,khongGian);
        repoStreamer.add(phongMayStreamers);
        System.out.println("thêm thành công");

    }

    @Override
    public void searchStream() throws NotFoundException {
        repoStreamer.displayList();

        if (repoStreamer.phongMayStreamersList.isEmpty()) {
            System.out.println("danh sách rỗng");
        } else {
            System.out.println("Nhập Tài Khoản bạn muốn tìm");
            String taiKhoan = sc.nextLine();
            for (int i = 0; i < repoStreamer.phongMayStreamersList.size(); i++) {
                if (taiKhoan.equals(repoStreamer.phongMayStreamersList.get(i).getTaiKhoang())) {
                    repoStreamer.search(i);
                } else {
                    System.out.println("không có trong danh sách!!!");
                }
                break;
            }
        }

    }

    @Override
    public void displayStream() throws NotFoundException {
        repoStreamer.displayList();

    }


    @Override
    public void removeStream() throws NotFoundException {
        displayStream();
        if (repoStreamer.phongMayStreamersList.isEmpty()) {
            System.out.println("danh sách rỗng");
        } else {
            System.out.println("nhập tài khoảng bạn muốn xóa");
            String taiKhoang = sc.nextLine();
            String yourAcceptance = "";
            for (int i = 0; i < repoStreamer.phongMayStreamersList.size(); i++) {
                if (taiKhoang.equals(repoStreamer.phongMayStreamersList.get(i).getTaiKhoang())) {
                    System.out.println("bạn có chắc chắn muốn xóa");
                    yourAcceptance = sc.nextLine();
                    if (yourAcceptance.equalsIgnoreCase("yes")) {
                        repoStreamer.remove(i);
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
