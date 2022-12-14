package projectmodule2.jokecode1.Sevices;

import projectmodule2.jokecode1.Model.Experience;
import projectmodule2.jokecode1.Model.Fresher;
import projectmodule2.jokecode1.Model.Intern;

import java.util.ArrayList;
import java.util.List;

public class Servicesimpl implements Services {
    public  List<Experience> experienceList = new ArrayList<>();
    public  List<Fresher> fresherList = new ArrayList<>();
    public  List<Intern> internList = new ArrayList<>();

    @Override
    public void createFr(Fresher fresher) {
        fresherList.add(fresher);
    }

    @Override
    public void createIt(Intern intern) {
        internList.add(intern);
    }

    @Override
    public void createEx( Experience experience) {
        experienceList.add(experience);
    }

    @Override
    public void deleteEx(int experience) {
        experienceList.remove(experience);
    }

    @Override
    public void deleteFr(int fresher) {
        fresherList.remove(fresher);

    }

    @Override
    public void deleteIt(int intern) {
        internList.remove(intern);

    }

    @Override
    public void updateEx(int id ,Experience experience) {
        experienceList.set(id,experience);
    }

    @Override
    public void updateFr(int id ,Fresher fresher) {
        fresherList.set(id, fresher);
    }

    @Override
    public void updateIt(int id ,Intern intern) {
        internList.set(id,intern);
    }




}
