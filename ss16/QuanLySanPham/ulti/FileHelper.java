package projectmodule2.ss16.QuanLySanPham.ulti;

import projectmodule2.ss16.QuanLySanPham.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHelper {

    public static List<Product> readFile (String PATH){
        List<Product> productList = new ArrayList<>();
        File file = new File(PATH);
        ObjectInputStream objectInputStream = null;
        try {
            if(file.exists()){
                FileInputStream fis = new FileInputStream(PATH);
                objectInputStream = new ObjectInputStream(fis);
                productList = (List<Product>) objectInputStream.readObject();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return productList;
    }
    public static void writeFile(String path ,List<Product> productList) throws IOException {
        FileOutputStream fos = new FileOutputStream(path);
        ObjectOutputStream objectOutputStream = null;
        try {
             objectOutputStream = new ObjectOutputStream(fos);
             objectOutputStream.writeObject(productList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            objectOutputStream.close();
        }
    }
}
