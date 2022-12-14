package projectmodule2.caseStudy.Model;

import projectmodule2.caseStudy.Model.Person;

import java.util.Scanner;

public class Customer extends Person {
    private String typeGuest ;
    private String email;
    private String date;
    private String phoneNum;
    private String sex;
    public Customer(String id, String name, String age, String address, String typeGuest, String email, String date, String phoneNum, String sex,String idInformation) {
        super(id, name, age, address);
        this.typeGuest = typeGuest;
        this.email = email;
        this.date = date;
        this.phoneNum = phoneNum;
        this.sex = sex;
    }



    public Customer() {

    }

    public String getTypeGuest() {
        return typeGuest;
    }


    public void setTypeGuest(String typeGuest) {
        this.typeGuest = typeGuest;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "typeGuest='" + typeGuest + '\'' +
                ", email='" + email + '\'' +
                ", date='" + date + '\'' +
                ", phoneNum=" + phoneNum +
                ", sex='" + sex + '\'' +
                '}';
    }

}
