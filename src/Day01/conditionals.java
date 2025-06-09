package Day01;

import java.util.Scanner;

public class conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Check two number which is greater

        System.out.print("Enter first number: ");
        int x = sc.nextInt();
        System.out.print("Enter second number: ");
        int y = sc.nextInt();

        if(x>y)
            System.out.println(x +" is larger");
        else if(y>x)
            System.out.println(y +" is larger");
        else
            System.out.println("Both are same");
    }
}
