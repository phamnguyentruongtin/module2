package projectmodule2.ss11.Services;

import projectmodule2.ss11.Model.Product;
import projectmodule2.ss11.Repository.IRepository;
import projectmodule2.ss11.Repository.Repository;

import java.util.Collection;
import java.util.Collections;

public class ServicesProducts implements IServicesProduct {
    IRepository repository = new Repository();

    @Override
    public void addProduct(Product product) {
        repository.productList.add(product);
    }


    @Override
    public void editProduct(int id, Product productSearch) {
        repository.productList.set(id,productSearch);

    }

    @Override
    public void removeProduct(int id) {
        repository.productList.remove(id);

    }

    @Override
    public void search(int id) {
        for (int i = 0;i<=repository.productList.size();i++) {
            if(id == repository.productList.get(i).getIdProduct()){
                System.out.println(repository.productList.get(i));
                break;
            }else {
                System.out.println("please input conrrect id ");
            }

        }

    }

    @Override
    public void display() {
        for (Product product :
                repository.productList) {
            System.out.println(repository.productList);
        }
    }



}

