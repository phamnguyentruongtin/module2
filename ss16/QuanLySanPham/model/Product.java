package projectmodule2.ss16.QuanLySanPham.model;

import java.io.Serializable;

public class Product implements Serializable {
    private static final long serialVersionUID = 3l;
    private String idProduct;
    private String nameProduct;
    private String productCompany;
    private String productPrice;

    public Product() {
    }

    public Product(String idProduct, String nameProduct, String productCompany, String productPrice) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.productCompany = productCompany;
        this.productPrice = productPrice;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getProductCompany() {
        return productCompany;
    }

    public void setProductCompany(String productCompany) {
        this.productCompany = productCompany;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct='" + idProduct + '\'' +
                ", nameProduct='" + nameProduct + '\'' +
                ", productCompany='" + productCompany + '\'' +
                ", productPrice='" + productPrice + '\'' +
                '}';
    }
}
