package Day05.Pattern;

// Q6. Print the following pattern
//      *           *
//        *       *
//          *   *
//            *

//Output
//        Enter a number: 4
//        *           *
//          *       *
//            *   *
//              *

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                if (i==j) System.out.print("*" + " ");
                else System.out.print(" " + " ");
            }
            for (int j=1;j<=n-1; j++){
                if (i+j == n) System.out.print("*" + " ");
                else System.out.print(" " + " ");
            }
            System.out.println();
        }

    }
}
