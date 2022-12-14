package projectmodule2.caseStudy.Model;

import java.io.Serializable;

public abstract class Person implements Serializable {
    private static final long serialVersionUID = 4l;
    private String id;
    private String name;
    private String age;
    private String address;
    private String idInfomation;

    public String getIdInfomation() {
        return idInfomation;
    }

    public void setIdInfomation(String idInfomation) {
        this.idInfomation = idInfomation;
    }

    public Person(String id, String name, String age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.idInfomation = idInfomation;
    }

    public Person() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
