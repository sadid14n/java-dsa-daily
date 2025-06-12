package Day04.PatternPrinting;

import java.util.Scanner;

//Output
//Enter a number: 4
//        * * * *
//        * * *
//        * *
//        *

public class TriangleReverseStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            for (int j=0; j<=(n-i); j++){
                System.out.print("*" +" ");
            }
            System.out.println();
        }
    }
}
