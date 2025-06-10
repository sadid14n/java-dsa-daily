package Day02;

import java.util.Scanner;

public class leastOfThreeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Find least of three number


        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd number: ");
        int c = sc.nextInt();

        if(a<b)
            if (a<c)
                System.out.println(a+" is least");
            else
                System.out.println(c + " is least");
        else if(b<c)
            if (b<a)
                System.out.println(b+" is least");
            else
                System.out.println(a+" is least");
        else if (c<a)
            if (c<b)
                System.out.println(c+" is least");
            else
                System.out.println(b+" is least");
         else
            System.out.println("All are same");
//        if(a<=b && a<=c)
//            System.out.println(a+" is least");
//        else if(b<=c && b<=a)
//            System.out.println(b+" is least");
//        else
//            System.out.println(c+" is least");
    }
}
