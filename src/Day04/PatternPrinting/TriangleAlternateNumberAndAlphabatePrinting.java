package Day04.PatternPrinting;

import java.util.Scanner;

//Output
//Enter a number: 4
//  1
//  A B
//  1 2 3
//  A B C D

public class TriangleAlternateNumberAndAlphabatePrinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            if (i%2 == 0){
                for (int j=1; j<=i; j++){
                    System.out.print((char)(j+64) + " ");
                }
            }else {
                for (int j=1; j<=i; j++){
                    System.out.print(j + " ");
                }
            }

            System.out.println();
        }
    }
}
