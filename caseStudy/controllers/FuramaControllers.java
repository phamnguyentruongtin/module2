package projectmodule2.caseStudy.controllers;

import com.sun.org.apache.bcel.internal.generic.Select;
import projectmodule2.caseStudy.Services.EmployeeServices;
import projectmodule2.caseStudy.Services.IEmployeeService;
import projectmodule2.caseStudy.exception.NotFoundException;

import java.io.IOException;
import java.util.Scanner;

public class FuramaControllers {
    private static int selectchoice;
    private static boolean baclToMenu = true;

    private static IEmployeeService employeeService = new EmployeeServices();

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        do {
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            selectchoice = Integer.parseInt(s.nextLine());
            switch (selectchoice) {
                case 1:
                    do {
                        System.out.println("1 Display list employees");
                        System.out.println("2 Add new employee");
                        System.out.println("3 Edit employee");
                        System.out.println("4 Return main menu");
                        int selectchoiceEmploye = Integer.parseInt(s.nextLine());
                        switch (selectchoiceEmploye) {
                            case 1:
                                try {
                                    employeeService.displayEmployeeService();
                                } catch (NotFoundException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 2:
                                try {
                                    employeeService.addEmployeeService();
                                } catch (NotFoundException e) {
                                    e.printStackTrace();
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 3:
                                try {
                                    employeeService.editEmployeeService();
                                } catch (NotFoundException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 4:
                                baclToMenu = false;
                                break;
                            default:
                                System.out.println("vui lòng chọn đúng ");
                        }
                    } while (baclToMenu);
                    break;
                case 2:
                    System.out.println("1. Display list customers");
                    System.out.println("2. Add new customer ");
                    System.out.println("3. Edit customer");
                    System.out.println("4. Return main menu");
                    break;
                case 3:
                    System.out.println("1 Display list facility");
                    System.out.println("2 Add new facility");
                    System.out.println("3 Display list facility maintenance");
                    System.out.println("4 Return main menu");
                    break;
                case 4:
                    System.out.println("1. Add new booking");
                    System.out.println("2. Display list booking");
                    System.out.println("3. Create new constracts");
                    System.out.println("4. Display list contracts");
                    System.out.println("5. Edit contracts");
                    System.out.println("6. Return main menu");
                    break;
                case 5:
                    System.out.println("1. Display list customers use service");
                    System.out.println("2. Display list customers get voucher");
                    System.out.println("3. Return main menu");
                    break;
                case 6:
                    System.out.println("Thank for use");
                    System.exit(selectchoice);
                default:
                    System.out.println("---Please choose the correct function!!---");
            }


        } while (true);
    }

}



