package Day05.Pattern;

import java.util.Scanner;

// Q2. Print the following pattern
//        1 2 3 4
//        1 2 3
//        1 2
//        1

//Output
//Enter a number: 4
//        1 2 3 4
//        1 2 3
//        1 2
//        1

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            for (int j=1;j<=n+1-i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
