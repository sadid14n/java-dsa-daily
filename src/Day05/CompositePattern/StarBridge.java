package Day05.CompositePattern;

import java.util.Scanner;

//Output
//Enter a number: 4
//        * * * * * * *
//        * * *   * * *
//        * *       * *
//        *           *


public class StarBridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int m = n-1;
        for (int i=1; i<=2*n-1; i++) System.out.print("*" + " ");
        System.out.println();
        for (int i=1; i<=m; i++) {
            for (int j=1; j<=n-i; j++) System.out.print("*" + " ");
            for (int j=1; j<=2*i-1; j++) System.out.print(" " + " ");
            for (int j=n-i; j>=1; j--) System.out.print("*" + " ");

            System.out.println();
        }
    }
}
