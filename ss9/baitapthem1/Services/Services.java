package projectmodule2.ss9.baitapthem1.Services;

import projectmodule2.ss9.baitapthem1.Model.Student;
import projectmodule2.ss9.baitapthem1.Model.Teacher;
import projectmodule2.ss9.baitapthem1.Repo.IRepo;
import projectmodule2.ss9.baitapthem1.Repo.Repo;

import java.util.Scanner;

public class Services implements IServices{
    IRepo repo = new Repo();
    static Scanner sc = new Scanner(System.in);
    static String forSure ;


    @Override
    public void addStudent() {
        System.out.println("Enter ID Student");
        int idStuden = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Name Student");
        String nameStudent = sc.nextLine();
        System.out.println("Enter Day of birth of Student");
        String dateStuden = sc.nextLine();
        System.out.println("Enter Sex of Student");
        String sexStudent = sc.nextLine();
        System.out.println("Enter CLass Name Of Student");
        String classNameStudent = sc.nextLine();
        System.out.println("Enter Point ");
        double pointStudent = Double.parseDouble(sc.nextLine());
        Student student = new Student(idStuden,nameStudent,dateStuden,sexStudent,classNameStudent,pointStudent);
        repo.addStudent(student);
    }

    @Override
    public void addTeachers() {
        System.out.println("Enter ID Teacher");
        int idTeacher = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Name Teacher ");
        String nameTeacher = sc.nextLine();
        System.out.println("Enter Day of birth of Teacher ");
        String dateTeacher = sc.nextLine();
        System.out.println("Enter Sex of Teacher");
        String sexTeacher = sc.nextLine();
        System.out.println("Enter The teaching subject");
        String teacherSubject = sc.nextLine();
        Teacher teacher =new Teacher(idTeacher,nameTeacher,dateTeacher,sexTeacher,teacherSubject);
        repo.addTeacher(teacher);
    }

    @Override
    public void removeStuden() {
        repo.displayStudent();
        System.out.println("Enter Id you want to delete");
        int idRemoveStudent = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < IRepo.studentList.size(); i++) {
            if (idRemoveStudent == IRepo.studentList.get(i).getId()){
                System.out.println("for sure");
                forSure = sc.nextLine();
                if (forSure.equals("yes") ){
                    repo.removeStudent(i);
                    System.out.println("remove complete");
                    break;
                }else {
                    System.out.println("Not complete");
                    break;
                }
            }else {
                System.out.println("please enter the true Id");
            }

        }
    }

    @Override
    public void removeTeacher() {
        repo.displayTeacher();
        System.out.println("Enter Id you want to delete");
        int idRemoveStudent = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < IRepo.teacherList.size(); i++) {
            if (idRemoveStudent == IRepo.teacherList.get(i).getId()){
                System.out.println("for sure");
                forSure = sc.nextLine();
                if (forSure.equals("yes")){
                    repo.removeTeachers(i);
                    System.out.println("remove complete");
                }else {
                    System.out.println("Not complete");
                }
                break;
            }else {
                System.out.println("please enter the true Id");
            }

        }

    }

    @Override
    public void displayStudent() {
        repo.displayStudent();

    }

    @Override
    public void displayTeacher() {
        repo.displayTeacher();
    }
}
