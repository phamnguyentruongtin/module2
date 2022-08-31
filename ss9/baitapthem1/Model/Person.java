package projectmodule2.ss9.baitapthem1.Model;

public abstract  class Person {
    private int id;
    private String name;
    private String date;
    private String sex;

    public Person(int id, String name, String date, String sex) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.sex = sex;
    }

    public Person() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public abstract void add();
    public abstract void remove();
    public abstract void display();
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
