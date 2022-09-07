package projectmodule2.ss11.Services;

import projectmodule2.ss11.Model.Product;



public interface IServicesProduct {
    void addProduct(Product product) ;




    void editProduct(int id,Product product);



    void removeProduct(int product);


    void search(int id);

    void display();





}
