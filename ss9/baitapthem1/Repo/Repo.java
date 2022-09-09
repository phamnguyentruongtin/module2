package projectmodule2.ss9.baitapthem1.Repo;

import projectmodule2.ss9.baitapthem1.Model.Student;
import projectmodule2.ss9.baitapthem1.Model.Teacher;

public class Repo implements IRepo {
    @Override
    public void addStudent(Student student) {
        studentList.add(student);
    }

    @Override
    public void addTeacher(Teacher teacher) {
        teacherList.add(teacher);
    }

    @Override
    public void removeStudent(int student) {
        studentList.remove(student);
    }

    @Override
    public void removeTeachers(int teacher) {
        teacherList.remove(teacher);
    }

    @Override
    public void displayStudent() {
        for (Student student : studentList
        ) {
            System.out.println(studentList);

        }
    }

    @Override
    public void displayTeacher() {
            for (Teacher teacher:
                 teacherList) {
                    System.out.println(teacherList);

            }
    }
}
