package projectmodule2.jokecode1.Model;

public class Intern extends Candidates  {
    private String major;
    private int semeste;
    private String uniName;

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getSemeste() {
        return semeste;
    }

    public void setSemeste(int semeste) {
        this.semeste = semeste;
    }

    public String getUniName() {
        return uniName;
    }

    public void setUniName(String uniName) {
        this.uniName = uniName;
    }

    public Intern(int candidatesId, String firstName, String lastName, String birthDate, double phone, String add, String email, String major, String semeste, String uniName) {
        super(candidatesId, firstName, lastName, birthDate, phone, add, email);
        this.major = major;
        this.semeste = Integer.parseInt(semeste);
        this.uniName = uniName;
    }


    @Override
    public String toString() {
        return "Intern{" +super.toString()+
                "major='" + major + '\'' +
                ", semeste=" + semeste +
                ", uniName='" + uniName + '\'' +
                '}';
    }
}
