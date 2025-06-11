package Day03;

import java.util.Scanner;

public class sumOfAllDigitOfANumber {
    public static void main(String[] args) {
//        Calculate the sum of all digit of a number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;
        while (n!=0){
            sum += n%10;
            n = n/10;
        }
        System.out.println("sum: "+sum);
    }
}
