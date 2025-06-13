package Day05.CompositePattern;

import java.util.Scanner;

//  Output
//Enter a number: 4
//        1 2 3 4 5 6 7
//        1 2 3   5 6 7
//        1 2       6 7
//        1           7


public class NumberBridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for (int i=1; i<=2*n-1; i++) System.out.print(i + " ");
        System.out.println();
        n--;
        for (int i=1; i<=n;i++){
            int a = 1;
            for (int j=1; j<=n+1-i; j++) System.out.print(a++ + " ");
            for (int j=1; j<=2*i-1; j++) {
                System.out.print(" " + " ");
                a++;
            }
            for (int j=1; j<=n+1-i; j++) System.out.print(a++ + " ");
            System.out.println();
        }

    }
}
