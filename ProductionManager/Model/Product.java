package projectmodule2.ss11.Model;

public  class Product implements Comparable<Product> {
    private int idProduct;
    private String nameProduct;
    private double price;
    private int date;

    public Product(int idProduct, String nameProduct, double price,int date) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.price = price;
        this.date = date;
    }

    public Product() {
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct=" + idProduct +
                ", nameProduct='" + nameProduct + '\'' +
                ", price=" + price +
                '}';
    }


    @Override
    public int compareTo(Product o) {
        return this.nameProduct.compareTo(o.nameProduct);
    }
}
