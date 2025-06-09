package Day01;

import java.util.Scanner;

public class simpleInterset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Calculate simple interest

        System.out.print("Enter Principal amount: ");
        double p = sc.nextDouble();
        System.out.print("Enter Rate: ");
        double r = sc.nextDouble();
        System.out.print("Enter Time: ");
        double t = sc.nextDouble();

        double si = p*r*t / 100;

        System.out.println("Simple Interest is = "+ si);

    }
}
