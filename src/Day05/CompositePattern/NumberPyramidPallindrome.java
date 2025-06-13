package Day05.CompositePattern;

import java.util.Scanner;

//  Output
//Enter a number: 4
//              1
//            1 2 1
//          1 2 3 2 1
//        1 2 3 4 3 2 1


public class NumberPyramidPallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n-i; j++) System.out.print(" " + " ");
            for (int j=1; j<=i; j++) System.out.print(j + " ");
            for (int j=i-1; j>=1; j--) System.out.print(j + " ");
            System.out.println();
        }
    }
}
