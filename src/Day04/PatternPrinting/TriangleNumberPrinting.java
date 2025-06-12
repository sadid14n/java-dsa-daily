package Day04.PatternPrinting;

import java.util.Scanner;

//Output
//Enter a number: 4
//        1
//        1 2
//        1 2 3
//        1 2 3 4

public class TriangleNumberPrinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
}
