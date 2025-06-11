package Day03;

import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
//        Generate a fibonacci series

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how much term you want to print: ");
        int n = sc.nextInt();

        int first = 0, second = 1;

        for (int i=1; i<=n; i++){
            System.out.println(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }

    }
}
