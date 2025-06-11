package Day03;

import java.util.Scanner;

public class countNumberOfDigit {
    public static void main(String[] args) {
//        Q1) Count the digit of a given number

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int count = 0;
        do{
            n = n/10;
            count++;
        }while (n!=0);
        System.out.println(count);
    }
}
