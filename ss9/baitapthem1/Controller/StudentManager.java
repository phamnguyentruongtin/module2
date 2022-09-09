package projectmodule2.ss9.baitapthem1.Controller;


import projectmodule2.ss9.baitapthem1.Services.IServices;
import projectmodule2.ss9.baitapthem1.Services.Services;


import java.util.Scanner;

public class StudentManager {

    public static Scanner sc = new Scanner(System.in);
    static IServices services = new Services();

    public static void main(String[] args) {
        int selectChoice = 0;
        do {
            System.out.println("--CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN –");
            System.out.println("1 Thêm mới học sinh");
            System.out.println("2.Thêm mới giảng viên");
            System.out.println("3.Xóa học sinh");
            System.out.println("4 xóa giảng viên");
            System.out.println("5 hiển thị học sinh");
            System.out.println("6 hiển thị giảng viên");
            System.out.println("7 Thoát chưa trình");
            System.out.println("-----Vui Lòng Chọn Chức Năng-----");
            selectChoice = Integer.parseInt(sc.nextLine());
            switch (selectChoice) {
                case 1:
                    services.addStudent();
                    break;
                case 2:
                    services.addTeachers();
                    break;
                case 3:
                    services.removeStuden();
                    break;
                case 4:
                    services.removeTeacher();
                    break;
                case 5:
                    services.displayStudent();
                    break;
                case 6:
                    services.displayTeacher();
                    break;
                default:
                    System.out.println("vui lòng nhập đúng chức năng");
            }

        } while (selectChoice < 7 || selectChoice > 0);

    }
}