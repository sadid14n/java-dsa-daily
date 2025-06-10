package Day02;

import java.util.Scanner;

public class checkLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Check if a given year is Leap Year or Not

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if(((year%4 == 0) && (year%100 != 0)) || (year%400 == 0)  )
            System.out.println("Leap Year");
        else
            System.out.println("Not a Leap Year");
    }
}
