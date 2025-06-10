package Day02;

import java.util.Scanner;

public class greatestOfThreeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Find greatest of three number

        System.out.print("Enter 1st number: ");
        int x = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int y = sc.nextInt();
        System.out.print("Enter 3rd number: ");
        int z = sc.nextInt();

        if(x>y)
            if(x>z)
                System.out.println(x+ " is largest");
            else
                System.out.println(z+ " is largest");
        else if(y>z)
            if(y>x)
                System.out.println(y +" is largest");
            else
                System.out.println(x + " is largest");
        else if (z>x)
            if(z>y)
                System.out.println(z + " is largest");
            else
                System.out.println(y + " is largest");
        else
            System.out.println("All are same");

    }
}
