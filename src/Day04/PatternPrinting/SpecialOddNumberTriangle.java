package Day04.PatternPrinting;

import java.util.Scanner;

// Print the pattern
//Enter a number: 5
//        1
//        1 3
//        1 3 5
//        1 3 5 7
//        1 3 5 7 9

public class SpecialOddNumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();


//        for (int i=1; i<=n; i++){
//            for (int j=1; j<=i; j++){
//                System.out.print((2*j-1) + " ");
//            }
//            System.out.println();
//        }

        for (int i=1; i<=n; i++){
            int a = 1;
            for (int j=1; j<=i; j++){
                System.out.print(a + " ");
                a += 2;
            }
            System.out.println();
        }
    }
}
