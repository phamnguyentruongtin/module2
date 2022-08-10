package ss3;

public class gopmang {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5,};
        int[] arr2 = {6, 7, 8, 9, 10};
        int[] arr3;
        arr3 = new int[10];

        System.arraycopy(arr1,0,arr3,0,arr1.length);
        System.arraycopy(arr2,0,arr3,arr2.length,arr1.length);

        for (int i = 0;i<arr3.length;i++){
            System.out.println(arr3[i]);
        }
    }
}

