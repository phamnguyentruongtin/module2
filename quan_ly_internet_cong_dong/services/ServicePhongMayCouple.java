package projectmodule2.quan_ly_internet_cong_dong.services;

import projectmodule2.quan_ly_internet_cong_dong.exception.NotFoundException;
import projectmodule2.quan_ly_internet_cong_dong.model.PhongMayCouple;
import projectmodule2.quan_ly_internet_cong_dong.repo.IRepoCouple;
import projectmodule2.quan_ly_internet_cong_dong.repo.RepoCouple;
import projectmodule2.quan_ly_internet_cong_dong.validator.Validator;

import java.util.Scanner;

public class ServicePhongMayCouple implements IServicePhongMayCouple {
    IRepoCouple repoCouple = new RepoCouple();
    Scanner scanner = new Scanner(System.in);
    Validator validator = new Validator();


    @Override
    public void addCouple() throws NotFoundException {
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
        PhongMayCouple phongMayCouple = new PhongMayCouple();
        repoCouple.add(phongMayCouple);
        System.out.println("Thêm thành công");

    }

    @Override
    public void searchCouple()throws NotFoundException {
        repoCouple.displayList();
        if (repoCouple.phongMayCoupleList.isEmpty()){
            System.out.println("danh sách rỗng");
        } else{
            System.out.println("Nhập Tài Khoản bạn muốn tìm");
            String taiKhoan = scanner.nextLine();
            for (int i = 0; i < repoCouple.phongMayCoupleList.size(); i++){
                if (taiKhoan.equals(repoCouple.phongMayCoupleList.get(i).getTaiKhoang())){
                    repoCouple.search(i);
                } else{
                    System.out.println("không có trong danh sách!!!");
                }
                break;
            }
        }
    }

    @Override
    public void removeCouple()throws NotFoundException {
        displayCoupleList();
        if (repoCouple.phongMayCoupleList.isEmpty()) {
            System.out.println("danh sách rỗng");
        } else {
            System.out.println("nhập tài khoảng bạn muốn xóa");
            String taiKhoang = scanner.nextLine();
            String yourAcceptance = "";
            for (int i = 0; i < repoCouple.phongMayCoupleList.size();i++){
                if (taiKhoang.equals(repoCouple.phongMayCoupleList.get(i).getTaiKhoang())) {
                    System.out.println("bạn có chắc chắn muốn xóa");
                    yourAcceptance = scanner.nextLine();
                    if (yourAcceptance.equalsIgnoreCase("yes")) {
                        repoCouple.remove(i);
                        System.out.println("đã xóa thành công!!!");
                    } else {
                        System.out.println("bạn đã hoàn tác!!");
                    }

                }
                break;
            }
        }
    }

    @Override
    public void displayCoupleList() throws NotFoundException{
        repoCouple.displayList();

    }
}
