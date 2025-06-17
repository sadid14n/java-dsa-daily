package Day09;

public class AddTwo2DArray {
    public static void main(String[] args) {
        int[][] a = {{2,3,5},{7,3,8},{9,1,3}};
        int[][] b = {{8,3,9},{7,3,8},{9,1,3}};
        int[][] res = new int[3][3];

        for (int i=0;i<3;i++){
            for (int j = 0; j < 3; j++) {
                res[i][j] = a[i][j] + b[i][j];
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(res[i][j] +" ");
            }
            System.out.println();
        }
    }
}
