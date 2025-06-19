package Day11;

public class MatrixMultiplication {
    public static void main(String[] args) {
//        1 2      1 2
//        3 4      3 4

        int[][] a = {{1,2},{3,4}};
        int[][] b = {{1,2},{3,4}};

        if (a[0].length != b.length){
            System.out.println("Multiplication not possible");
        }else {
//            Multiplication possible
            int[][] ans = new int[a.length][b[0].length];
            for (int i = 0; i < ans.length; i++) {
                for (int j = 0; j < ans[0].length; j++) {
//                    ans[i][j] = a[i][0]*b[0][j] + a[i][1]*b[1][j] + a[i][2]*b[2][j] + ...

                    for (int k = 0; k < b.length; k++) {
                        ans[i][j] += a[i][k]*b[k][j];
                    }
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }

        }

    }
}
