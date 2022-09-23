package projectmodule2.ss16.QuanLySanPham.services;

import projectmodule2.ss16.QuanLySanPham.exception.NotFoundProductException;
import projectmodule2.ss16.QuanLySanPham.model.Product;

public interface IServices {
//    void addProduct() throws NotFoundProductException;
    Product getInfo();

    void addProduct(Product product);

    void searchProduct() throws NotFoundProductException;
    void removeProduct() throws NotFoundProductException;
    void displayPRoductList() throws NotFoundProductException;
    int id();
}
