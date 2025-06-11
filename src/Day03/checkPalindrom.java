package Day03;

import java.util.Scanner;

public class checkPalindrom {
    public static void main(String[] args) {
//        Check if a given string is palindrome or not

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String reverse = "";

        int len = str.length()-1;
        for (int i=len; i>=0; i--){
            reverse = reverse + str.charAt(i);

        }

        if (str.equals(reverse)) System.out.println("Yes, it is a palindrome: "+ str +" "+reverse);
        else System.out.println("No, not a palindrome: "+ str +" "+reverse);

    }
}
