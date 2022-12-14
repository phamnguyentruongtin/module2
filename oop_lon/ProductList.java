package oop_lon;

public class ProductList {
    ArrayList<Product> mylist= new ArrayList<>();
    public ProductList() {
        // TODO Auto-generated constructor stub
        mylist.add(new ProductIn(111, "In-111",200, 4.1));
        mylist.add(new ProductIn(222, "In-222",400, 4.2));
        mylist.add(new ProductIn(333, "In-333",800, 4.3));
        mylist.add(new ProductOut(444, "Out-444", 200,2, "Vn"));
        mylist.add(new ProductOut(555, "Out-555", 200,2, "HCM"));
    }
    public ArrayList<Product> getMylist() {
        return mylist;
    }
    public void setMylist(ArrayList<Product> mylist) {
        this.mylist = mylist;
    }
    public void display() {
        for (Product product : mylist) {
            System.out.println(""+product.toString());
        }
    }

}
