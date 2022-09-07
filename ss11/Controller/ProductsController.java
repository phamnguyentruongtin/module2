package projectmodule2.ss11.Controller;

import projectmodule2.ss11.Model.Product;
import projectmodule2.ss11.Repository.IRepository;
import projectmodule2.ss11.Repository.Repository;
import projectmodule2.ss11.Services.IServicesProduct;
import projectmodule2.ss11.Services.ServicesProducts;

import java.util.Scanner;

public class ProductsController {
    private static Scanner sc = new Scanner(System.in);
    private static int selectChoice = 0;
    private static Product product = new Product();
    private static IServicesProduct servicesProduct = new ServicesProducts();
    private static IRepository repository = new Repository();


    private static void add() {
        System.out.println("Input Id Product");
        int idProduct = Integer.parseInt(sc.nextLine());
        System.out.println("Input Name Product");
        String nameProduct = sc.nextLine();
        System.out.println("Input Price of Product");
        double price = Double.parseDouble(sc.nextLine());
        System.out.println("input Date of Product");
        int date = Integer.parseInt(sc.nextLine());
        Product product = new Product(idProduct, nameProduct, price, date);
        servicesProduct.addProduct(product);
    }

    private static void edit() {
        System.out.println("input id product you want to edit");
        int idEdit = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < repository.productList.size(); i++) {
            if (idEdit == repository.productList.get(i).getIdProduct()) {
                System.out.println("Input Id Product");
                int idProduct = Integer.parseInt(sc.nextLine());
                System.out.println("Input Name Product");
                String nameProduct = sc.nextLine();
                System.out.println("Input Price of Product");
                double price = Double.parseDouble(sc.nextLine());
                System.out.println("input Date of Product");
                int date = Integer.parseInt(sc.nextLine());
                Product productEdit = new Product(idProduct, nameProduct, price, date);
                servicesProduct.editProduct(idEdit, productEdit);
                break;
            } else {
                System.out.println("Please input the correct");
            }
        }
    }

    public static void remove() {
        System.out.println("input id product you want to delete");
        int idRemove = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < repository.productList.size(); i++) {
            if (idRemove == repository.productList.get(i).getIdProduct()) {
                servicesProduct.removeProduct(i);
                System.out.println("remove finish");
                break;
            } else {
                System.out.println("Please input the correct");
            }
        }
    }

    public static void search() {
        System.out.println("input the id of product you want to search");
        int idSearch = Integer.parseInt(sc.nextLine());
        servicesProduct.search(idSearch);
    }

    public static void main(String[] args) {
        do {
            System.out.println("---Manager Products---");
            System.out.println("1 Add Product");
            System.out.println("2 Edit Product");
            System.out.println("3 Remove Product");
            System.out.println("4 Display Product");
            System.out.println("5 Search Product");
            System.out.println("6 Exit Program");
            System.out.println("Please choice function");
            selectChoice = Integer.parseInt(sc.nextLine());
            switch (selectChoice) {
                case 1:
                    add();
                    break;
                case 2:
                    edit();
                    break;
                case 3:
                    remove();
                    break;
                case 4:
                    servicesProduct.display();
                    break;
                case 5:
                    search();
                    break;
                case 6:
                    System.exit(6);
                default:
                    System.out.println("Please enter the correct function");
            }


        } while (selectChoice < 7 || selectChoice > 0);
    }
}