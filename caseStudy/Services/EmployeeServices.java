package projectmodule2.caseStudy.Services;

import projectmodule2.caseStudy.Model.Employee;
import projectmodule2.caseStudy.Model.Person;
import projectmodule2.caseStudy.exception.NotFoundException;
import projectmodule2.caseStudy.ulti.FileHelper;
import projectmodule2.ss16.QuanLySanPham.exception.NotFoundProductException;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class EmployeeServices implements IEmployeeService {
    private int selectLevel;
    private int selectPosition;
    private String PATH_EMPLOYEE = "F:\\CODEGYM\\module2\\project module2\\src\\projectmodule2\\caseStudy\\ulti\\Employee.dat";
    private Scanner sc = new Scanner(System.in);
    List<Person> employeeList = FileHelper.readFile(PATH_EMPLOYEE);

    @Override
    public void addEmployeeService()  {
        System.out.println("Enter id employee");
        String idEmploye = sc.nextLine();
        System.out.println("Enter name :");
        String name = sc.nextLine();
        System.out.println("Enter date of birth :");
        String date = sc.nextLine();
        System.out.println("Enter address");
        String add = sc.nextLine();
        System.out.println("Enter sex ");
        String sex = sc.nextLine();
        System.out.println("Enter id Information :");
        String idInfo = sc.nextLine();
        System.out.println("Enter phone number :");
        String phoneNumber = sc.nextLine();
        System.out.println("Enter email :");
        String mail = sc.nextLine();
        String level = "";
        do {
            System.out.println("Select level");
            System.out.println("1 Trung cấp");
            System.out.println("2 Cao đẳng");
            System.out.println("3 Đại học");
            System.out.println("4 Sau Đại học");
            selectLevel = Integer.parseInt(sc.nextLine());
            switch (selectLevel) {
                case 1:
                    level = "Trung cấp";
                    break;
                case 2:
                    level = "Cao đẳng";
                    break;
                case 3:
                    level = "đại học";
                    break;
                case 4:
                    level = "Sau đại học";
                    break;
                default:
                    System.out.println("Vui Lòng Nhập Đúng!!!");
            }
        } while (selectLevel > 5 || selectLevel < 0);
        String position = "";
        do {
            System.out.println("1: lễ Tân");
            System.out.println("2: Phục vụ");
            System.out.println("3: Chuyên viên");
            System.out.println("4: Giám sát");
            System.out.println("5: Quản Lý");
            System.out.println("6: Giám đốc");
            selectPosition = Integer.parseInt(sc.nextLine());
            switch (selectPosition) {
                case 1:
                    position = "Lễ tân";
                    break;
                case 2:
                    position = "Phục vụ";
                    break;
                case 3:
                    position = "Chuyên viên";
                    break;
                case 4:
                    position = "Giám sát";
                    break;
                case 5:
                    position = "Quản Lý";
                    break;
                case 6:
                    position = "Giám đốc";
                    break;
                default:
                    System.out.println("Vui lòng chọn đúng!!");

            }
        } while (selectPosition > 7 || selectPosition < 0);
        System.out.println("Enter wage ");
        String wage = sc.nextLine();
        Employee employe = new Employee(idEmploye, name, date, add, sex, phoneNumber, mail, level, position, wage, idInfo);
        employeeList.add(employe);
        try {
            FileHelper.writeFile(PATH_EMPLOYEE, employeeList);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    @Override
    public void editEmployeeService() {
        System.out.println("nhập id của employee bạn muốn sửa");
        String idEdit = sc.nextLine();
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList == null) {
                System.out.println("danh sách rỗng");
                break;
            } else {
                if (idEdit.equals(employeeList.get(i).getId())) {
                    System.out.println("Enter id employee");
                    String idEmploye = sc.nextLine();
                    System.out.println("Enter name :");
                    String name = sc.nextLine();
                    System.out.println("Enter date of birth :");
                    String date = sc.nextLine();
                    System.out.println("Enter address");
                    String add = sc.nextLine();
                    System.out.println("Enter sex ");
                    String sex = sc.nextLine();
                    System.out.println("Enter id Information :");
                    String idInfo = sc.nextLine();
                    System.out.println("Enter phone number :");
                    String phoneNumber = sc.nextLine();
                    System.out.println("Enter email :");
                    String mail = sc.nextLine();
                    String level = null;
                    do {
                        System.out.println("Select level");
                        System.out.println("1 Trung cấp");
                        System.out.println("2 Cao đẳng");
                        System.out.println("3 Đại học");
                        System.out.println("4 Sau Đại học");
                        selectLevel = Integer.parseInt(sc.nextLine());
                        switch (selectLevel) {
                            case 1:
                                level = "Trung cấp";
                                break;
                            case 2:
                                level = "Cao đẳng";
                                break;
                            case 3:
                                level = "đại học";
                                break;
                            case 4:
                                level = "Sau đại học";
                                break;
                            default:
                                System.out.println("Vui Lòng Nhập Đúng!!!");
                                break;
                        }
                    } while (selectLevel > 5 || selectLevel < 0);
                    String position = null;
                    do {
                        System.out.println("1: lễ Tân");
                        System.out.println("2: Phục vụ");
                        System.out.println("3: Chuyên viên");
                        System.out.println("4: Giám sát");
                        System.out.println("5: Quản Lý");
                        System.out.println("6: Giám đốc");
                        selectPosition = Integer.parseInt(sc.nextLine());
                        switch (selectPosition) {
                            case 1:
                                position = "Lễ tân";
                                break;
                            case 2:
                                position = "Phục vụ";
                                break;
                            case 3:
                                position = "Chuyên viên";
                                break;
                            case 4:
                                position = "Giám sát";
                                break;
                            case 5:
                                position = "Quản Lý";
                                break;
                            case 6:
                                position = "Giám đốc";
                                break;
                            default:
                                System.out.println("Vui lòng chọn đúng!!");

                        }
                    } while (selectPosition > 7 || selectPosition < 0);
                    System.out.println("Enter wage ");
                    String wage = sc.nextLine();
                    Employee employe = new Employee(idEmploye, name, date, add, sex, phoneNumber, mail, level, position, wage, idInfo);
                    break;
                }
            }
        }
    }

    @Override
    public void displayEmployeeService()  {
        List<Person> employeeList = FileHelper.readFile(PATH_EMPLOYEE);
        if (employeeList.size() == 0) {
            System.out.println("danh sach rong");
        }
        for (Person person : employeeList) {
            System.out.println(person);
        }
    }
}
