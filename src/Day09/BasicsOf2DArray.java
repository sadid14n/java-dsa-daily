package Day09;

public class BasicsOf2DArray {
    public static void main(String[] args) {
        int[][] grid = new int[3][3];

        int num = 10;
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                grid[i][j] = num;
                num+=10;
            }
        }
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.print(grid[i][j] + " ");

            }
            System.out.println();
        }

        System.out.println();

//        Another way to initialize array

        int b[][] = {{2,5,3},{6,8,3}};
//        Row = 2
//        Col = 3
        int m = b.length;
        int n = b[0].length;
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

//        Print using for each loop
        System.out.println();
        for (int[] ele: b){
            for (int x : ele){
                System.out.print(x + " ");
            }
            System.out.println();
        }

    }

}
