package Day09;

public class TransposeOfAMatrix {
    public static void main(String[] args) {
//        1 2
//        3 4
//        5 6

//         1 3 5
//         2 4 6

        int[][] a = {{1,2},{3,4},{5,6}};
        int m = a.length;
        int n = a[0].length;

        int[][] b = new int[n][m];
//        Taking transpose and store in new array
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                b[j][i] = a[i][j];
            }
        }
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }


////        Row wise printing
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//
////        Col wise printing - transpose
//        for (int j = 0; j < n; j++) {
//            for (int i = 0; i < m; i++) {
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println();

    }
}
