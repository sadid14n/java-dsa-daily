package Day04.PatternPrinting;

import java.util.Scanner;

// Output
//Enter a number: 3
//        1 2 3
//        1 2 3
//        1 2 3

        public class SquareNumberPrinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
