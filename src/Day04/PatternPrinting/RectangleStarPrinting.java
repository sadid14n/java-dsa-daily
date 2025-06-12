package Day04.PatternPrinting;

import java.util.Scanner;

// Print a rectangle of m*n

// Output
//        Enter no of rows: 3
//        Enter no of cols: 5
//        * * * * *
//        * * * * *
//        * * * * *

        public class RectangleStarPrinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of rows: ");
        int m = sc.nextInt();
        System.out.print("Enter no of cols: ");
        int n = sc.nextInt();

        for (int i=1; i<=m; i++){
            for (int j=1; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
