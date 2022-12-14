package projectmodule2.jokecode1.Controller;

import projectmodule2.jokecode1.Model.Experience;
import projectmodule2.jokecode1.Model.Fresher;
import projectmodule2.jokecode1.Model.Intern;
import projectmodule2.jokecode1.Sevices.Servicesimpl;
import java.util.Scanner;

public class CandiateManagementSystem {
    private static int select1 = 0;
    private static int select = 0;
    private static int select2 = 0;
    private static int select3 = 0;

    private static int select4 = 0;

    static Scanner sc = new Scanner(System.in);

    static Servicesimpl servicesimpl = new Servicesimpl();


    public static void add() {
        System.out.println("Nhập id");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập first name");
        String firstName = sc.nextLine();
        System.out.println("Nhập last name");
        String lastName = sc.nextLine();
        System.out.println("Nhập Birthdate");
        String birthDate = sc.nextLine();
        System.out.println("Nhập address");
        String address = sc.nextLine();
        System.out.println("Nhập phone numbers");
        int phoneNumbers = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập email");
        String email = sc.nextLine();
        if (select == 1) {
            System.out.println("Nhập exp years");
            String explnYear = sc.nextLine();
            System.out.println("Nhập proskill");
            String proSkill = sc.nextLine();
            Experience experience = new Experience(id, firstName, lastName, birthDate, phoneNumbers, address, explnYear, proSkill, email);
            servicesimpl.createEx(experience);

        } else if (select == 2) {
            int selectRank = 0;
            System.out.println("Nhập graduation date");
            String graduationDay = sc.nextLine();
            System.out.println("chọn graduation rank");
            String graduationRank = "";
            switch (selectRank) {
                case 1:
                    graduationRank = "Excellence";
                    break;
                case 2:
                    graduationRank = "Good";
                    break;
                case 3:
                    graduationRank = "fair";
                    break;
                case 4:
                    graduationRank = "Poor";
                    break;
                default:
                    System.out.println("vui lòng nhập đúng");
            }
            String education = sc.nextLine();
            Fresher fresher = new Fresher(id, firstName, lastName, birthDate, phoneNumbers, address, email, graduationDay, graduationRank, education);
            servicesimpl.createFr(fresher);
        } else if (select == 3) {
            System.out.println("Nhập majors");
            String majors = sc.nextLine();
            System.out.println("Nhập semester");
            String semesters = sc.nextLine();
            System.out.println("Nhập university name");
            String universityName = sc.nextLine();
            Intern intern = new Intern(id, firstName, lastName, birthDate, phoneNumbers, address, email, majors, semesters, universityName);
            servicesimpl.createIt(intern);
        }

    }

    public static void update() {
        System.out.println("Nhập id bạn Muốn thay đổi");
        int idupdate = Integer.parseInt(sc.nextLine());
        if (select == 1) {
            for (int i = 0; i < servicesimpl.experienceList.size(); i++) {
                if (idupdate == servicesimpl.experienceList.get(i).getCandidatesId()) {
                    System.out.println("Nhập id");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhập first name");
                    String firstName = sc.nextLine();
                    System.out.println("Nhập last name");
                    String lastName = sc.nextLine();
                    System.out.println("Nhập Birthdate");
                    String birthDate = sc.nextLine();
                    System.out.println("Nhập address");
                    String address = sc.nextLine();
                    System.out.println("Nhập phone numbers");
                    int phoneNumbers = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhập email");
                    String email = sc.nextLine();
                    System.out.println("Nhập exp years");
                    String explnYear = sc.nextLine();
                    System.out.println("Nhập proskill");
                    String proSkill = sc.nextLine();
                    Experience experience = new Experience(id, firstName, lastName, birthDate, phoneNumbers, address, explnYear, proSkill, email);
                    servicesimpl.updateEx(idupdate, experience);
                    break;
                } else
                    System.out.println("vui lòng nhâp đúng id");
            }
        } else if (select == 2) {
            for (int i = 0; i < servicesimpl.fresherList.size(); i++) {
                if (idupdate == servicesimpl.fresherList.get(i).getCandidatesId()) {
                    System.out.println("Nhập id");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhập first name");
                    String firstName = sc.nextLine();
                    System.out.println("Nhập last name");
                    String lastName = sc.nextLine();
                    System.out.println("Nhập Birthdate");
                    String birthDate = sc.nextLine();
                    System.out.println("Nhập address");
                    String address = sc.nextLine();
                    System.out.println("Nhập phone numbers");
                    int phoneNumbers = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhập email");
                    String email = sc.nextLine();
                    int selectRank = 0;
                    System.out.println("Nhập graduation date");
                    String graduationDay = sc.nextLine();
                    System.out.println("chọn graduation rank");
                    String graduationRank = "";
                    selectRank = Integer.parseInt(sc.nextLine());
                    switch (selectRank) {
                        case 1:
                            graduationRank = "Excellence";
                            break;
                        case 2:
                            graduationRank = "Good";
                            break;
                        case 3:
                            graduationRank = "fair";
                            break;
                        case 4:
                            graduationRank = "Poor";
                            break;
                        default:
                            System.out.println("vui lòng nhập đúng");
                    }
                    String education = sc.nextLine();
                    Fresher fresher = new Fresher(id, firstName, lastName, birthDate, phoneNumbers, address, email, graduationDay, graduationRank, education);
                    servicesimpl.updateFr(idupdate, fresher);
                    break;
                } else {
                    System.out.println("vui lòng nhập đúng id");
                }
            }
        } else if (select == 3) {
            for (int i = 0; i < servicesimpl.internList.size(); i++) {
                if (idupdate == servicesimpl.internList.get(i).getCandidatesId()) {
                    System.out.println("Nhập id");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhập first name");
                    String firstName = sc.nextLine();
                    System.out.println("Nhập last name");
                    String lastName = sc.nextLine();
                    System.out.println("Nhập Birthdate");
                    String birthDate = sc.nextLine();
                    System.out.println("Nhập address");
                    String address = sc.nextLine();
                    System.out.println("Nhập phone numbers");
                    int phoneNumbers = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhập email");
                    String email = sc.nextLine();
                    System.out.println("Nhập majors");
                    String majors = sc.nextLine();
                    System.out.println("Nhập semester");
                    String semesters = sc.nextLine();
                    System.out.println("Nhập university name");
                    String universityName = sc.nextLine();
                    Intern intern = new Intern(id, firstName, lastName, birthDate, phoneNumbers, address, email, majors, semesters, universityName);
                    servicesimpl.updateIt(idupdate, intern);
                    break;
                } else {
                    System.out.println("vui lòng nhập đúng id");
                }
            }
        }

    }

    public static void delete() {
        int idRemove = Integer.parseInt(sc.nextLine());
        if (select == 1) {
            for (int i = 0; i < servicesimpl.experienceList.size(); i++) {
                if (idRemove == servicesimpl.experienceList.get(i).getCandidatesId()) {
                    servicesimpl.deleteEx(i);
                }
            }

        } else if (select == 2) {
            for (int i = 0; i < servicesimpl.fresherList.size(); i++) {
                if (idRemove == servicesimpl.fresherList.get(i).getCandidatesId()) {
                    servicesimpl.deleteFr(i);
                }

            }
        } else if (select == 3) {
            for (int i = 0; i < servicesimpl.internList.size(); i++) {
                if (idRemove == servicesimpl.internList.get(i).getCandidatesId()) {
                    servicesimpl.deleteIt(i);
                }

            }

        }
    }

    public static void display() {
        if (select == 1) {
            for (int i = 0; i < servicesimpl.experienceList.size(); i++) {
                System.out.println(servicesimpl.experienceList);

            }
        } else if (select == 2) {
            for (int i = 0; i < servicesimpl.fresherList.size(); i++) {
                System.out.println(servicesimpl.fresherList);

            }
        } else if (select == 3) {
            for (int i = 0; i < servicesimpl.internList.size(); i++) {
                System.out.println(servicesimpl.internList);
            }
        }
    }

    public static void search() {
        String searchName = sc.nextLine();
        if (select4 == 1) {
            for (int i = 0; i < servicesimpl.experienceList.size(); i++) {
                if (searchName.equals(servicesimpl.experienceList.get(i).getFirstName())) {
                    System.out.println(servicesimpl.experienceList);
                    break;
                } else {
                    System.out.println("vui lòng nhập đúng tên");
                }

            }

        } else if (select4 == 2) {
            for (int i = 0; i < servicesimpl.fresherList.size(); i++) {
                if (searchName.equals(servicesimpl.fresherList.get(i).getFirstName())) {
                    System.out.println(servicesimpl.fresherList);
                    break;
                } else {
                    System.out.println("vui lòng nhập đúng tên");
                }

            }

        } else if (select4 == 3) {
            for (int i = 0; i < servicesimpl.internList.size(); i++) {
                if (searchName.equals(servicesimpl.internList.get(i).getFirstName())) {
                    System.out.println(servicesimpl.internList);
                    break;
                } else {
                    System.out.println("vui lòng nhập đúng tên");
                }

            }
        }
    }


    public static void main(String[] args) {

        do {
            System.out.println("---Chương Trình Quản Lí Nhân Viên---");
            System.out.println("1. Experience");
            System.out.println("2. Fresher");
            System.out.println("3. Internship");
            System.out.println("4. Searching");
            System.out.println("5. Exit");
            try {
                select = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                select = 6;
            }

            switch (select) {
                case 1:
                    System.out.println("1 THêm");
                    System.out.println("2 Cập Nhập");
                    System.out.println("3 Xóa");
                    System.out.println("4 Hiển thị");
                    try {
                        select1 = Integer.parseInt(sc.nextLine());
                    } catch (NumberFormatException e) {
                        select1 = 5;
                    }
                    switch (select1) {
                        case 1:
                            add();
                            break;
                        case 2:
                            update();
                            break;
                        case 3:
                            delete();
                            break;
                        case 4:
                            display();
                            break;
                        default:
                            System.out.println("vui lòng nhập đúng");
                    }
                    break;

                case 2:
                    System.out.println("1 THêm");
                    System.out.println("2 Cập Nhập");
                    System.out.println("3 Xóa");
                    System.out.println("4 Hiển thị");
                    try {
                        select2 = Integer.parseInt(sc.nextLine());
                    } catch (NumberFormatException e) {
                        select2 = 5;
                    }
                    switch (select2) {
                        case 1:
                            add();
                            break;
                        case 2:
                            update();
                            break;
                        case 3:
                            delete();
                            break;
                        case 4:
                            display();
                            break;
                        default:
                            System.out.println("vui lòng nhập đúng");
                    }
                    break;
                case 3:
                    System.out.println("1 THêm");
                    System.out.println("2 Cập Nhập");
                    System.out.println("3 Xóa");
                    System.out.println("4 Hiển thị");
                    try {
                        select3 = Integer.parseInt(sc.nextLine());
                    } catch (NumberFormatException e) {
                        select3 = 5;
                    }
                    switch (select3) {
                        case 1:
                            add();
                            break;
                        case 2:
                            update();
                            break;
                        case 3:
                            delete();
                            break;
                        case 4:
                            display();
                            break;
                        default:
                            System.out.println("vui lòng nhập đúng");
                    }
                    break;
                case 4:
                    System.out.println("TÌm Experience");
                    System.out.println("Tìm Fresher");
                    System.out.println("TÌm Internship");
                    try {
                        select4 = Integer.parseInt(sc.nextLine());
                    } catch (NumberFormatException e) {
                        select4 = 4;
                    }
                    switch (select4) {
                        case 1:
                            search();
                            break;
                        case 2:
                            search();
                            break;
                        case 3:
                            search();
                            break;
                        default:
                            System.out.println("vui lòng nhập đúng");
                    }
                    break;
                case 5:
                    System.out.println("Thanks for use");
                    System.exit(select);
                default:
                    System.out.println("vui lòng nhập đúng chức năng");

            }

        } while (true);
    }
}