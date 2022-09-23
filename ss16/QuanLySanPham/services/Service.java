package projectmodule2.ss16.QuanLySanPham.services;

import projectmodule2.ss16.QuanLySanPham.exception.NotFoundProductException;
import projectmodule2.ss16.QuanLySanPham.model.Product;
import projectmodule2.ss16.QuanLySanPham.ulti.FileHelper;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Service implements IServices {
//    private IRepoProduct repoProduct = new RepoProduct();
    FileHelper fileHelper = new FileHelper();
    private static Scanner sc = new Scanner(System.in);
    static String PATH_PRODUCT = "F:\\CODEGYM\\module2\\project module2\\src\\projectmodule2\\ss16\\QuanLySanPham\\data\\Product.dat";
    private List<Product> repo = fileHelper.readFile(PATH_PRODUCT);

    public Product getInfo(){
        System.out.println("Nhập id Sản Phẩm");
        String idProduct = sc.nextLine();
        System.out.println("Nhập Tên Sản Phẩm");
        String nameProduct = sc.nextLine();
        System.out.println("Nhập Hãng Sản Phẩm");
        String productCompany = sc.nextLine();
        System.out.println("Nhập Giá Sản Phẩm");
        String productPrice = sc.nextLine();
        Product product = new Product(idProduct, nameProduct, productCompany, productPrice);
        return product;
    }
    @Override
    public void addProduct(Product product) {
        repo.add(product);
        try {
            fileHelper.writeFile(PATH_PRODUCT,repo);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("DONE!!");

    }

    @Override
    public void searchProduct() throws NotFoundProductException {
        String idSearchProduct = null;
        if (repo == null) {
            System.out.println("Chưa có danh sách để Tìm vui lòng nhập danh sách!!!");
        } else {
            System.out.println("Nhập id của sản phẩm bạn muốn tìm kiếm :");
            idSearchProduct = sc.nextLine();
            for (int i = 0; i < repo.size(); i++) {
                if (idSearchProduct.equals(repo.get(i).getIdProduct())) {
                    System.out.println(repo.get(i));
                    break;
                } else {
                    throw new NotFoundProductException("sản phẩm không tồn tại");
                }
            }
        }


    }

    @Override
    public void removeProduct() throws NotFoundProductException {
        String yourSure  =null;
        List<Product> productListFile = (List<Product>) FileHelper.readFile(PATH_PRODUCT);
        if (productListFile == null) {
            System.out.println("Chưa có danh sách để xóa vui lòng nhập danh sách!!!");
        } else {
            System.out.println("Nhập id của sản phẩm bạn muốn xóa :");
            String idRemoveProduct = sc.nextLine();
            for (int i = 0; i < productListFile.size(); i++) {
                if (idRemoveProduct.equals(productListFile.get(i).getIdProduct())) {
                    System.out.println("bạn có chắc chắn muốn xóa");
                    yourSure = sc.nextLine();
                    if (yourSure.equalsIgnoreCase("yes")){
                    productListFile.remove(i);
                        System.out.println("Done!!");
                    break;
                    }else {
                        break;
                    }
                } else {
                    throw new NotFoundProductException("sản phẩm không tồn tại");
                }
            }
            try {
                FileHelper.writeFile(PATH_PRODUCT,productListFile);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void displayPRoductList() {
        List<Product> productListFile = (List<Product>) FileHelper.readFile(PATH_PRODUCT);
        if (productListFile == null) {
            System.out.println("Chưa có danh sách để hiển thị vui lòng nhập danh sách!!!");
        } else {
            for (int i = 0; i < productListFile.size() ; i++) {
                System.out.println(productListFile.get(i));
            }
        }
    }

    @Override
    public int id() {
        List<Product> productListFile = (List<Product>) FileHelper.readFile(PATH_PRODUCT);
        return (productListFile.size() > 0) ? (productListFile.size() + 1) : 1;
    }

}
