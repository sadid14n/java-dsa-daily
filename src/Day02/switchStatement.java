package Day02;

import java.util.Scanner;

public class switchStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter the operator: ");
        char op = sc.next().charAt(0);
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();

//        if(op == '+') System.out.println(a+b);
//        if(op == '-') System.out.println(a-b);
//        if(op == '*') System.out.println(a*b);
//        if(op == '/') System.out.println(a/b);

        switch (op){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
