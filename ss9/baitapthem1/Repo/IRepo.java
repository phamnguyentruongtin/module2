package projectmodule2.ss9.baitapthem1.Repo;

import projectmodule2.ss9.baitapthem1.Model.Student;
import projectmodule2.ss9.baitapthem1.Model.Teacher;

import java.util.ArrayList;
import java.util.List;

public interface IRepo {
    List<Student> studentList = new ArrayList<>();
    List<Teacher> teacherList = new ArrayList<>();

    void addStudent(Student student);
    void addTeacher(Teacher teacher);
    void removeStudent(int student);
    void removeTeachers(int teacher);
    void displayStudent();
    void displayTeacher();

}
