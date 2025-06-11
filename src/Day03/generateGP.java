package Day03;

import java.util.Scanner;

public class generateGP {
    public static void main(String[] args) {
//        Generate the GP upto N terms: 1 2 4 8 16 32 ... upto N terms
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many terms you want to print: ");
        int n = sc.nextInt();

        int a = 1, d = 2;
        for (int i=1; i<=n; i++){
            System.out.println(a);
            a*=d;
        }
    }
}
