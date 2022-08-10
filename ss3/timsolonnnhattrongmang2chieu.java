package ss3;

public class timsolonnnhattrongmang2chieu {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int max = 0;
        for (int i = 0;i<array.length;i++){
            for (int j = 0;j<array.length;j++){
                if(max<array[i][j]){
                    max = array[i][j];
                }
            }
        }
        System.out.println(max);

    }
}