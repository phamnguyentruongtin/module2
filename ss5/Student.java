package projectmodule2.ss5;

import java.util.Scanner;

public class Student {
    String name = "john";
    String classes = "C02";

    public Student(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }

    public Student() {

    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student std1 = new Student();
        System.out.println("moi ban nhap ten");
        std1.setName(scanner.nextLine());
        System.out.println("moi ban nhap lop");
        std1.setClasses(scanner.nextLine());
        System.out.println("ten la " + std1.getName());
        System.out.println("lop la " + std1.getClasses());


    }

}
