package projectmodule2.ss9.baitapthem1.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student extends Person {
    private String className;
    private double point;


    public Student(int id, String name, String date, String sex, String className, double point) {
        super(id, name, date, sex);
        this.className = className;
        this.point = point;
    }

    public Student() {
        super();

    }


    @Override
    public String toString() {
        return "Student{" + "className =" + className + "point" + point +
                '}' + super.toString();

    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint (double point) {
        this.point = point;
    }

}
