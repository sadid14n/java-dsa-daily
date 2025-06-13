package Day05.CompositePattern;

import java.util.Scanner;

// Output
//Enter a number: 5
//                *
//              * * *
//            * * * * *
//          * * * * * * *
//        * * * * * * * * *


public class StarPyramidNSTNSP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int nsp = n-1;
        int nst = 1;
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=nsp; j++){
                System.out.print(" " + " ");
            }
            for (int j=1; j<=nst; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
            nsp--;
            nst += 2;
        }

    }
}
