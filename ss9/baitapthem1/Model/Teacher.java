package projectmodule2.ss9.baitapthem1.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teacher extends Person {
    private String monDay ;
    Scanner sc = new Scanner(System.in);

   static List<Teacher> teacherList = new ArrayList<Teacher>();

    public Teacher(int id, String name, String date, String sex, String monDay) {
        super(id, name, date, sex);
        this.monDay = monDay;
    }

    public Teacher() {

    }

    @Override
    public void add() {
        System.out.print("Nhập id giảng viên");
        this.setId(Integer.parseInt(sc.nextLine()));
        System.out.print("Nhập tên giảng viên");
        this.setName(sc.nextLine());
        System.out.print("Nhập ngày tháng năm sinh giảng viên");
        this.setDate(sc.nextLine());
        System.out.print("Nhập giới tính giảng viên");
        this.setSex(sc.nextLine());
        System.out.print("Nhập chuyên môn của giảng viên");
        this.setMonDay(sc.nextLine());
        Teacher teacher = new Teacher(getId(),getName(),getDate(),getSex(),getMonDay());
        teacherList.add(teacher);
   }
    @Override
    public void remove() {
        System.out.println("Nhập id bạn muốn xóa");
        int idRemove = 0 ;
        int selectChoice = 0 ;
        idRemove  = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < teacherList.size(); i++) {
            if (idRemove == teacherList.get(i).getId() ){
                selectChoice = Integer.parseInt(sc.nextLine());
                System.out.println("Nhập 1 để xóa");
                System.out.println("Nhập 2 để hoàn tác");
                switch (selectChoice){
                    case 1 :
                        teacherList.remove(i);
                        System.out.println("xoa thanh cong");
                        break;
                    case 2:
                        break;
                }

            }else {
                System.out.println("không có id bạn muốn xóa");
            }
        }
    }


    @Override
    public void display() {
        for(int i = 0;i<teacherList.size() ; i++){
            System.out.println(teacherList.get(i));
        }
    }

    public String getMonDay() {
        return monDay;
    }

    public void setMonDay(String monDay) {
        this.monDay = monDay;
    }
}
