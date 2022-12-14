package projectmodule2.jokecode1.Model;

import projectmodule2.jokecode1.Sevices.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Experience extends Candidates  {
    private int expYear;
    private String proSkill;



    public Experience(int candidatesId, String firstName, String lastName, String birthDate, double phone, String add, String expYear, String proSkill, String email) {
        super(candidatesId, firstName, lastName, birthDate, phone, add, email);
        this.expYear = Integer.parseInt(expYear);
        this.proSkill = proSkill;
    }

    public int getExpYear() {
        return expYear;
    }

    public void setExpYear(int expYear) {
        this.expYear = expYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public String toString() {
        return "Experience{" + super.toString() +
                "expYear=" + expYear +
                ", proSkill='" + proSkill +
                '}';
    }
}
