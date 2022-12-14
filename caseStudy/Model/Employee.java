package projectmodule2.caseStudy.Model;

public class Employee extends Person {
    private String sex ;
    private String phoneNum;
    private String email;
    private String level ;
    private String position ;
    private String wage;

    public Employee(String id, String name, String age, String address, String sex, String phoneNum, String email, String level, String position, String wage,String idInformation) {
        super(id, name, age, address);
        this.sex = sex;
        this.phoneNum = phoneNum;
        this.email = email;
        this.level = level;
        this.position = position;
        this.wage = wage;
    }
    public Employee(){

    }

    public String getSex() {
        return sex;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLevel() {
        return level;
    }





    public String getPosition() {
        return position;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getWage() {
        return wage;
    }

    public void setWage(String wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "sex='" + sex + '\'' +
                ", phoneNum=" + phoneNum +
                ", email='" + email + '\'' +
                ", level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", wage=" + wage +
                '}';
    }
}
