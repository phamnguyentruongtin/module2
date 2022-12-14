package projectmodule2.jokecode1.Sevices;

import projectmodule2.jokecode1.Model.Experience;
import projectmodule2.jokecode1.Model.Fresher;
import projectmodule2.jokecode1.Model.Intern;

public interface Services {
    void createFr(Fresher fresher);
    void createIt(Intern intern);
    void createEx( Experience experience);

    void deleteEx(int experience);

    void deleteFr(int fresher);

    void deleteIt(int intern);

    void updateEx(int id,Experience experience);
    void updateFr(int id,Fresher fresher);
    void updateIt(int id,Intern intern);



}
