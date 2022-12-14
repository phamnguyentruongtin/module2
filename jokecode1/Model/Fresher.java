package projectmodule2.jokecode1.Model;

import projectmodule2.jokecode1.Sevices.Services;

public class Fresher extends Candidates  {
    private int graduationeTime;
    private int graduationeRank;
    private String education;

    public Fresher(int candidatesId, String firstName, String lastName, String birthDate, double phone, String add, String email, int graduationeTime, int graduationeRank, String education) {
        super(candidatesId, firstName, lastName, birthDate, phone, add, email);
        this.graduationeTime = graduationeTime;
        this.graduationeRank = graduationeRank;
        this.education = education;
    }

    public Fresher(int id, String firstName, String lastName, String birthDate, int phoneNumbers, String address, String email, String graduationDay, String graduationRank, String education) {
    }

    public int getGraduationeTime() {
        return graduationeTime;
    }

    public void setGraduationeTime(int graduationeTime) {
        this.graduationeTime = graduationeTime;
    }

    public int getGraduationeRank() {
        return graduationeRank;
    }

    public void setGraduationeRank(int graduationeRank) {
        this.graduationeRank = graduationeRank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public String toString() {
        return "Fresher{" + super.toString() +
                "graduationeTime=" + graduationeTime +
                ", graduationeRank=" + graduationeRank +
                ", education='" + education + '\'' +
                '}';
    }
}
