package projectmodule2.ss9.baitapthem1.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teacher extends Person {
    private String monDay;

    public Teacher(int id, String name, String date, String sex, String monDay) {
        super(id, name, date, sex);
        this.monDay = monDay;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "monDay='" + monDay + '\'' + super.toString() +
                '}';
    }

    public Teacher() {

    }

    public String getMonDay() {
        return monDay;
    }

    public void setMonDay(String monDay) {
        this.monDay = monDay;
    }
}
