package projectmodule2.jokecode1.Model;

public abstract class Candidates {
    private int candidatesId ;
    private String firstName;
    private String lastName;
    private String birthDate;
    private double phone;
    private String add;
    private String email;

    public Candidates(int candidatesId, String firstName, String lastName, String birthDate, double phone, String add, String email) {
        this.candidatesId = candidatesId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.phone = phone;
        this.add = add;
        this.email = email;
    }
    public Candidates(){

    }

    public int getCandidatesId() {
        return candidatesId;
    }

    public void setCandidatesId(int candidatesId) {
        this.candidatesId = candidatesId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public double getPhone() {
        return phone;
    }

    public void setPhone(double phone) {
        this.phone = phone;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Candidates{" +
                "candidatesId=" + candidatesId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", phone=" + phone +
                ", add='" + add + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
