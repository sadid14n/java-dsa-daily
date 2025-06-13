package Day05.Pattern;

// Q5. Print the following pattern
//        *
//        **
//        ***
//        ****
//        ***
//        **
//        *

//Output
//        Enter a number: 4
//        *
//        * *
//        * * *
//        * * * *
//        * * *
//        * *
//        *


import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            for (int j=1;j<=i;j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        for (int i=1; i<=n-1;i++){
            for (int j=1; j<=n-i; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
