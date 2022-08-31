package projectmodule2.ss9.baitapthem1.Controller;

import projectmodule2.ss9.baitapthem1.Model.Student;
import projectmodule2.ss9.baitapthem1.Model.Teacher;


import java.util.Scanner;

public class StudentManager {

    public static Student student = new Student();
    public static Teacher teacher = new Teacher();
    public static  Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int selectChoice =0;
        do {
            System.out.println("--CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN –");
            System.out.println("1 hoặc 4 hoac Thêm mới giảng viên hoặc học sinh");
            System.out.println("2.hoặc 5 Xóa giảng viên hoặc học sinh");
            System.out.println("3.hoặc 6 Xem danh sách giảng viên hoặc học sinh");
            System.out.println("7. Thoát");
            System.out.println("Chọn chức năng:");
            selectChoice = Integer.parseInt(sc.nextLine());
            switch (selectChoice) {
                case 1:
                    student.add();
                    break;
                case 2:
                    student.remove();
                    break;
                case 3:
                    student.display();
                    break;
                case 4:
                    teacher.add();
                    break;
                case 5:
                    teacher.remove();
                    break;
                case 6:
                    teacher.display();
                    break;
            }

        } while (selectChoice != 7);

    }
}