package projectmodule2.caseStudy.Services;

import projectmodule2.caseStudy.exception.NotFoundException;

import java.io.IOException;

public interface IEmployeeService {
    void displayEmployeeService()throws NotFoundException;
    void addEmployeeService() throws NotFoundException, IOException;
    void editEmployeeService() throws NotFoundException;
}
