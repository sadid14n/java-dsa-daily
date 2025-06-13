package Day05.CompositePattern;

import java.util.Scanner;

// Output
//Enter a number: 5
//          A
//        A B
//      A B C
//    A B C D
//  A B C D E


public class CharacterTriangleFlippdeComposite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            for (int j=1; j<=n-i; j++){
                System.out.print(" " + " ");
            }
            for (int j=1; j<=i; j++){
                System.out.print((char)(j+64) + " ");
            }
            System.out.println();
        }
    }
}
