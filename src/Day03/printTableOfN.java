package Day03;

import java.util.Scanner;

public class printTableOfN {
    public static void main(String[] args) {
//        Print table of N
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter which table you want to print: ");
        int n = sc.nextInt();

        for (int i=n; i<=(n*10); i+=n){
            System.out.println(i);
        }
    }

}
