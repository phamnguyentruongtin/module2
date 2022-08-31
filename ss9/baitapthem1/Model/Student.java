package projectmodule2.ss9.baitapthem1.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student extends Person{
    private String className;
    private int point;

    List<Student> studentList = new ArrayList<Student>();

    Scanner sc = new Scanner(System.in);

    public Student(int id, String name, String date, String sex, String className, int point) {
        super(id, name, date, sex);
        this.className = className;
        this.point = point;
    }
    public Student(){
        super();

    }


    @Override
    public String toString() {
        return "Student{" +
                "studentList=" + studentList +
                '}'+super.toString();

    }
    @Override
    public void add() {
        System.out.print("NHập id sinh viên");
        this.setId(Integer.parseInt(sc.nextLine()));
        System.out.print("NHập tên sinh viên");
        this.setName(sc.nextLine());
        System.out.print("NHập ngày tháng năm sinh");
        this.setDate(sc.nextLine());
        System.out.print("NHập giới tính");
        this.setSex(sc.nextLine());
        System.out.print("NHập nhập tên lớp");
        this.setClassName(sc.nextLine());
        System.out.print("NHập điểm sinh viên");
        this.setPoint(Integer.parseInt(sc.nextLine()));
        Student student1 = new Student(getId(),getName(),getDate(),getSex(),getClassName(),getPoint());
        studentList.add(student1);
    }

    @Override
    public void remove() {
        System.out.println("Nhập id bạn muốn xóa");
        int idRemove = 0 ;
        int selectChoice = 0 ;
        idRemove  = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < this.studentList.size(); i++) {
            if (idRemove ==this.studentList.get(i).getId() ){
                selectChoice = Integer.parseInt(sc.nextLine());
                System.out.println("Nhập 1 để xóa");
                System.out.println("Nhập 2 để hoàn tác");
                switch (selectChoice){
                    case 1 :
                        studentList.remove(getId());
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
        for(int i = 0; i <=studentList.size(); i++){
            System.out.println(studentList);
        }
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

}
