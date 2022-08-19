package projectmodule2.ss7.bai2.bai1;

public class main {
    public static void main(String[] args) {
        shape[] shapes = new shape[3];
        shapes[0] = new circle("red",false,12);
        shapes[1] = new Retacgle("blue",true,13,13);
        shapes[2] = new square("blue",true,13);
        System.out.println("Ban đầu");
        for (shape shape: shapes) {
            System.out.println(shape.getArea());
        }
        // tăng diện tích tất cả lên 20%
        for (shape shape:shapes) {
            shape.resize(100);
        }
        System.out.println("sau khi tăng ");
        for (shape shape:shapes) {
            System.out.println(shape.getArea());
        }
    }
}
